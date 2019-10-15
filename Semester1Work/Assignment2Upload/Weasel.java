package com.bham.pij.assignments.a2a;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
public class Weasel extends GAApplication{
    FinalVariables store = new FinalVariables();

    private ArrayList<Character> population;
    private int chromosomeSize;
    private String targetedString;
    public ArrayList<Character> genecharacter;
    public ArrayList<Character> generationcharacter;

    protected int determine() {
        int returnValue = 2;
        return returnValue;
    }
    public Weasel(String targetString) {

        int chromosomeSize = targetString.length();
        targetedString = targetString;
    }
    public Weasel() {
        int max = 126;
        int min = 31;
        for (int j = 0; j < chromosomeSize; j++) {
            int randomchar = (int)(Math.random() * ((max - min) + 1)) + min;
            char toBeAdded = (char)randomchar;
            this.generationcharacter.add(toBeAdded);
        }
        this.genecharacter = generationcharacter;
    }

    // lets compiler know about overriding
    @Override
    // an overide to find the fitness of a string
    protected double getFitness(String currentString) {
        // creates an array list of integers
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for loop to compare the characters
        for (int i = 0; i < targetedString.length(); i++) {
            // finds the character at postion i of the targetstring
            char targetStringCompare = targetedString.charAt(i);
            // finds the character at position i of the current string
            char currentStringCompare = currentString.charAt(i);
            // takes away the the targetstirng character from the final string character
            int charoperation = targetStringCompare - currentStringCompare;
            // makes sure the average value is above 0
            int averageChar = Math.abs(charoperation);
            // adds value to a list to later work out average
            list.add(averageChar);
        }
        // sets the intial total value
        int total = 0;
        // for loop to work out average
        for (int j = 0; j < list.size(); j++) {
            //takes the value from the array list to be added to total
            int addValue = list.get(j);
            // adds value to total
            total = total + addValue;
        }
        double fitness = total;
        // returns the fitness value of the string completes the method
        return fitness;
    }
    // lets complier know that i am overriding the mutatepopulation
    @Override
    // method to mutate the population
    protected ArrayList<Character> mutatePopulation(ArrayList<Character> list) {
        // intialises the value to be looked at
        char newLookAtValue = '0';
        // creates value to decide which way the mutation happens
        int max = 2;
        // creates value to decide which way mutation happens
        int min = 1;
        // intialises the decrement
        int decrement = 0;
        // for loop to mutate the population
        for (int i = 0; i < list.size(); i++) {
            // gets the character value from the list
            char lookAtValue = list.get(i);
            // calculate a random number between 0 and 1
            double randomMutation = Math.random();
            // if statement to start mutation if value is less than the mutation probabliltiy
            if (randomMutation <= store.mutationProbability) {
                // decides the direction in which the mutation will go
                int direction = (int)(Math.random() * ((max - min) + 1)) + min;
                // removes the value from the list
                list.remove(i);
                // if to to go up ascii value
                if (direction == 2) {
                    // converts the ascii value to an integer type
                    int asciivalue = (char)lookAtValue;
                    // increas the ascii value by one
                    int increment = asciivalue + 1;
                    // checks the value is in the requried ascii range
                    if (increment == 127) {
                        // if it isnt then it moves it down to 32
                        increment = 32;
                    }
                    // creates the new character from the increment value
                    char newChar = (char)increment;
                    // adds the character at the same position
                    list.add(i, newChar);
                    // otherwise looks at going the otherway
                } else if (direction == 1) {
                    // converts the aski vaue to a character
                    int asciivalue = (char)lookAtValue;
                    // decremtns the value
                    decrement = asciivalue - 1;
                    // checks if the value is in the requried range
                    if (decrement == 31) {
                        // if it isnt then it moves it to the top of the list
                        decrement = 126;
                    }
                }
                // converts the integer to ascii value
                char newChar = (char)decrement;
                // adds the acii value in the same palce
                list.add(i, newChar);
            }
        }
        // finsihes the method
        return list;
    }

    // tels the compiler tthe mthod is being overidden
    @Override
    // method to srot the pobluation
    protected void sortPopulation(ArrayList<String> list) {
        // sorts the population
        Collections.sort(list);
        // switches the order fo the lsit so that it can be used more eaisly in GAApplication
        Collections.reverse(list);
        // finsihes the method

    }
}
