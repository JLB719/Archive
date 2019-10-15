package com.bham.pij.assignments.a2a;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
// need to sort out this constructor
public class BinaryMaximiser extends GAApplication {
    private ArrayList<Character> binaryList;
    private String binary;
    protected int generatedsize;
    public ArrayList<Character> gene;
    public ArrayList<Character> generationbinary;
    Individual individuals = new Individual();
    FinalVariables store = new FinalVariables();
    // creates the final chromosoems size

    public BinaryMaximiser(int size) {
        this.generatedsize = size;
        String binary = "";
        for (int i = 0; i < size; i++) {
            binary = binary + "1";
        }
    }

    public BinaryMaximiser() {

        for (int i = 0; i < generatedsize; i++) {
        double randomgenerator = Math.random();
            if (randomgenerator < 0.5) {
                this.gene.add('0');
            }
            if (randomgenerator >= 0.5) {
                this.gene.add('1');
            }
        }
        this.gene = this.gene;
    }

    @Override
    protected int determine() {
        int returnValue = 1;
        return 1;
    }
    // overides the getFitness method
    @Override
    // method to find fitness
    protected double getFitness(String currentString) {
        // intiailes the count for ones
        int onecount = 0;
        // for loop to work cycle through the string
        for (int i = 0; i < currentString.length(); i++) {
            // takes the character at i
            char value = currentString.charAt(i);
            // checks if the value is 1 or not
            if (value == '1') {
                // adds 1 to the one count of the string
                onecount++;
            }
        }
        // converts the integer count to a string
        double fitness = onecount;
        // finishes the method
        return fitness;
    }
    // overides the mutation popualtin methd
    @Override
    // method for mutationg the population
    protected ArrayList<Character> mutatePopulation(ArrayList<Character> list) {

        // intialies the character look at
        char newLookAtValue = '0';
        // for loop to cycle through the list
        for (int i = 0; i < list.size(); i++) {
            // takes the character at i from the array list
            char lookAtValue = list.get(i);
            // genreats a random nmber between o and 1
            double randomMutation = Math.random();
            // checks if the random number genrated is below the mutation probalitity
            if (randomMutation <= store.mutationProbability) {
                // remvoes the current vlaue from the list
                list.remove(i);
                // checks if the value is 1
                if (lookAtValue == '1') {
                    // changes the value to 0
                    newLookAtValue = '0';
                    //adds the value to the list
                    list.add(i, newLookAtValue);
                    // chekcs if the value is 0
                } else if (lookAtValue == '0') {
                    // creates the new mutated value
                    newLookAtValue = '0';
                    // adds the new value to the list
                    list.add(i, newLookAtValue);
                }
            }
        }
        // finsihes the mthod
        return list;
    }
    // overides the method
    @Override
    // runs the method
    protected void sortPopulation(ArrayList<String> list) {
        // sorts the list
        Collections.sort(list);

    }
}
