package com.bham.pij.assignments.a2a;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
public abstract class GAApplication{
    FinalVariables store = new FinalVariables();
    Individual individual = new Individual();
    Individual[] individualType = new Individual[store.numberOfChromosomes];
    protected char[] list;
    public void initialise() {
        for (int i = 0; i < store.numberOfChromosomes; i ++) {
            individualType[i] = new Individual(i);
        }
    }

    // runs the genetic algortihm

    protected void run() {

        ArrayList<Character> binaryList = new ArrayList<Character>();
        for (int i = 0; i < store.numberOfChromosomes; i++) {
            String breakDown = individualType[i].individuals[i];
            for (int j = 0; j < individual.size; j++) {
                char toadd = breakDown.charAt(j);
                binaryList.add(toadd);
            }
        }
        // constrtucotr to use the indiviual class
        // initial populations
        int chromosomeSize = individual.size;
        int numberOfChromosomes = store.numberOfChromosomes;
        int genes = (numberOfChromosomes * chromosomeSize);
        // declares a sort list of a string
        ArrayList<String> binarySortList = new ArrayList<String>();
        // insitialists a substring
        String subString = "";
        // initailisses antoher string
        String subStringWithoutRanking = "";
        // initialises the binary count
        int binaryCount = 0;
        // converts the characters to strings
        for (int j = 0; j < binaryList.size(); j++) {
            // gets the character from the binaryList
            char sampleCharacter = binaryList.get(j);
            // creats a substring from the list
            subString = subString + sampleCharacter;
            // checks if the string is of the required length
            if (subString.length() == chromosomeSize) {
                // adds the substring
                binarySortList.add(subString);
                // resets the substring
                subString = "";
            }
        }

        // finds the fitness of a string and replaces the string in the arrya list
        // for loop to cycle through the string
        for (int i = 0; i < binarySortList.size(); i++) {
            // gets the string
            String fitnessString = binarySortList.get(i);
            // calls a method from individual to get the firtness
            double fitnessFindStringDouble = getFitness(fitnessString);
            String fitnessFindString = Double.toString(fitnessFindStringDouble);
            // creats a new string adding the fitness and the string
            String newString = fitnessFindString + fitnessString;
            // removes the old string
            binarySortList.remove(i);
            // adds the new string
            binarySortList.add(i, newString);
        }
        // clears the binary list
        binaryList.clear();
        // sorts the list
        ArrayList<String> transferList = new ArrayList<String>();
        sortPopulation(binarySortList);

        // clears the binary sort list
        //removes the fitness values
        transferList = removeFitness(binarySortList, chromosomeSize);
        // clears the binarysort list
        binarySortList.clear();
        // addes the values with the fitness removed to the binarySortList
        binarySortList.addAll(transferList);
        // clears the transfer list
        transferList.clear();
        // cyels through the sort list
        for (int i = 0; i < binarySortList.size(); i++) {
            // takes the string values at position i
            String focusString = binarySortList.get(i);
            // cyels through the current string adding charactes to the list
            for (int j = 0; j < focusString.length(); j++) {
                // takes the character at position j from the string
                char tobeadded = focusString.charAt(j);
                // adds the invidual character to the list
                binaryList.add(tobeadded);
            }
        }
        //ArrayList<Character> transferList2 = new ArrayList<Character>();
        // clears the string list
        binarySortList.clear();
        // mutates the population
        ArrayList<Character> transferList2 = mutatePopulation(binaryList);
        // clears the binary list
        binaryList.clear();
        // adds the transfer lsit to the binary list
        binaryList.addAll(transferList2);
        // clears the transfer list
        transferList.clear();

        String convertString = "";
        // converts the list to a string
        for (int j = 0; j < binaryList.size(); j++) {

            // adds the the characters to a string
            char addToSubList = binaryList.get(j);
            // adds the charactes to a usblist
            convertString = convertString + addToSubList;
            // checks if the sublist is the correct size
            if (convertString.length() == chromosomeSize) {
                //adds the string to the binarySortList
                binarySortList.add(convertString);
                // reests the string
                convertString = "";
            }
        }
        // works out the fitness of each invidivual in the list
        // cycles through the string
        for (int i = 0; i < binarySortList.size(); i++) {
            // takes the string at point i
            String fitnessString = binarySortList.get(i);
            // calls method to get fitness from string
            double fitnessFindDouble = getFitness(fitnessString);
            String fitnessFindString = Double.toString(fitnessFindDouble);
            // creats a new string by adding the fitness and the orignial stirng
            String newString = fitnessFindString + fitnessString;
            // removes the intial string
            binarySortList.remove(i);
            // adds the new string
            binarySortList.add(i, newString);
        }
        // sorts the list
        sortPopulation(binarySortList);

        // removes the fitness values again
        ArrayList<String> binarySortListCrossOver = removeFitness(binarySortList, chromosomeSize);
        // clears the slit again
        binarySortList.clear();

        // Declares the crossover parts
        String firstParentFirstPart = "";
        String firstParentSecondPart = "";
        String secondParentFirstPart = "";
        String secondParentSecondPart = "";
        // gets the proportion value
        double proportionOfParents = store.parentProportion;
        // calculates the number of parents needed
        double parentsize = (numberOfChromosomes * proportionOfParents);
        // delcares more varbiles
        int parentstaken = 0;
        // takes the first sample parent from the list declartion
        int takeParent = (binarySortListCrossOver.size()) - 1;
        String crossOverChild2 = "";
        String crossOverChild1 = "";

        // while loop where crossover is performed
        while (parentstaken <= parentsize) {
            // takes two parent strings from list
            String binarysampleParent1 = binarySortListCrossOver.get(takeParent);

            String binarysampleParent2 = binarySortListCrossOver.get((takeParent - 1));
            // generates a randomnumber for crossover
            double crossOverChance = Math.random();
            // checks if the number is less than the probaility
            if (crossOverChance <= store.crossOverProbability) {
                // declears the crossover point
                int randomCrossOverPoint = (int)(Math.random() * chromosomeSize);
                // creats the sub parts of the children
                firstParentFirstPart = binarysampleParent1.substring(0,randomCrossOverPoint);
                secondParentFirstPart = binarysampleParent2.substring(0,randomCrossOverPoint);
                firstParentSecondPart = binarysampleParent1.substring(randomCrossOverPoint);
                secondParentSecondPart = binarysampleParent2.substring(randomCrossOverPoint);
                // creats the children
                crossOverChild1 = firstParentFirstPart + secondParentSecondPart;
                crossOverChild2 = secondParentFirstPart + firstParentSecondPart;
                // removes the worst samples from the list
                binarySortListCrossOver.remove(0);
                binarySortListCrossOver.remove(1);
                // adds the new samples to the lsit
                binarySortListCrossOver.add(crossOverChild1);
                binarySortListCrossOver.add(crossOverChild2);
            }
            // moves down the parent list
            parentstaken = parentstaken + 2;
            takeParent = takeParent - 2;
        }
        for (int i = 0; i < binarySortListCrossOver.size(); i++) {
            String extraction = binarySortList.get(i);
            for (int j = 0; j < extraction.length(); j++) {
                char listadd = extraction.charAt(j);
                binaryList.add(listadd);
            }
        }


        for (int i = 0; i < binarySortListCrossOver.size(); i++) {
            // takes the string at point i
            String fitnessString = binarySortListCrossOver.get(i);
            // calls method to get fitness from string
            double fitnessFindDouble = getFitness(fitnessString);
            String fitnessFindString = Double.toString(fitnessFindDouble);
            // creats a new string by adding the fitness and the orignial stirng
            String newString = fitnessFindString + fitnessString;
            // removes the intial string
            binarySortListCrossOver.remove(i);
            // adds the new string
            binarySortListCrossOver.add(i, newString);
        }
        sortPopulation(binarySortListCrossOver);
        transferList = removeFitness(binarySortListCrossOver, chromosomeSize);
        binarySortList.clear();
        binarySortList = transferList;
        transferList.clear();

        for (int i = 0; i < chromosomeSize; i++) {
            String add = binarySortListCrossOver.get(i);
            individualType[i].individuals[i] = add;
        }

    }

    protected Individual getBest() {
        Individual bestIndividual = individualType[individual.size - 1];
        return bestIndividual;
    }

    private static ArrayList<String> removeFitness(ArrayList<String> list, int chromosomeSize) {
        // creats a new arrayslit
        ArrayList<String> binarySortListCrossOver = new ArrayList<String>();
        // creats the intial strings
        String subString = "";
        String newString = "";
        // for loop to get rid of the fitness
        for (int i = 0; i < list.size(); i++) {
            // gets the first tsring
            subString = list.get(i);
            // takes the rank
            int startPointRank = subString.length() - chromosomeSize;
            // for loop to remvoe
            for (int j = startPointRank; j < subString.length(); j++) {
                // takes thecharacter from the substring
                char chartobeaddedtonewlist = subString.charAt(j);
                // creats the new string
                newString = newString + chartobeaddedtonewlist;
            }
            // adds the new string
            binarySortListCrossOver.add(newString);
            // resets the values
            newString = "";
            startPointRank = 0;
        }
        //returns the list
        return binarySortListCrossOver;
    }
    // creats abtstrract methods
    protected abstract void sortPopulation(ArrayList<String> list);

    protected abstract ArrayList<Character> mutatePopulation(ArrayList<Character> list);
    protected abstract double getFitness(String currentString);
    protected abstract int determine();
}
