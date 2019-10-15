package com.bham.pij.assignments.a2a;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
public class Individual {
    FinalVariables store = new FinalVariables();
    BinaryMaximiser individual = new BinaryMaximiser();
    public BinaryMaximiser[] binaryMaxList;
    private ArrayList<Character> populationbinary;
    public String[] individuals = new String[store.numberOfChromosomes];
    public int size;

    public Individual() {
        BinaryMaximiser[] individualGene = new BinaryMaximiser[store.numberOfChromosomes];
        for (int i = 0; i < store.numberOfChromosomes; i++) {
            individualGene[i] = new BinaryMaximiser(individual.generatedsize);
        }
        for (int j = 0; j < store.numberOfChromosomes; j++) {
            individuals[j] = toString(individualGene[j].gene);
        }
        this.binaryMaxList = individualGene;
        size = individual.generatedsize;
    }
    public Individual(int i) {
        this.individuals[i] = individuals[i];
    }

    public boolean IsItBinary() {
        boolean isItBinary = false;
        for (int i = 0; i < binaryMaxList[i].gene.size(); i++) {
            char whatIsTheCharacter = binaryMaxList[i].gene.get(i);
            if (whatIsTheCharacter != '0' && whatIsTheCharacter != '1') {
                isItBinary = false;
            } else {
                isItBinary = true;
            }
        }
        return isItBinary;
    }
    private static String toString(ArrayList<Character> list) {
        // initialsises the string
        String convertedString = "";
        // for loop to run through the characters
        for (int i = 0; i < list.size(); i++) {
            // gets the character form the string
            char charToString = list.get(i);
            // creats the string
            convertedString = convertedString + charToString;
        }
        // finishes the method
        return convertedString;
    }
    protected double getFitness() {
        double fitnessdouble = 0;

        for (int i = 0; i < binaryMaxList[i].gene.size(); i++) {
            char currentChar = binaryMaxList[i].gene.get(i);
            if (currentChar == '1') {
                fitnessdouble = fitnessdouble + 1;
            }
        }
        return fitnessdouble;
    }
}
