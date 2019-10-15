package com.bham.pij.assignments.zombie;
import java.util.ArrayList;
public class BasicZombie {
    public int isthiscalled() {
        int i = 2;
        return i;
    }
}
    /*
    private ArrayList<Character> testingInteger;
    public ArrayList<Character> getTestingInteger() {
        return this.testingInteger;
    }
    public void setTestingInteger(ArrayList<Character> num) {
        this.testingInteger = num;
    }
}



















    /*
    public float health;
    public float decompostionRate;
    public int angerLevel;
    public String name;
    public ArrayList<Character> list;
    public int namelength;
    public char[] populationArray;
    private static ArrayList<Character> lister;
    public static ArrayList<Character> getList() {
        return lister;
    }
    public void setList(ArrayList<Character> list) {
        this.lister = list;
    }
    public static void main(String[] args) {
        System.out.print(lister);
    }
    public BasicZombie(int size) {
        ArrayList<Character> listed = new ArrayList<Character>();
        //this.name = name;
        //this.namelength = name.length();
        int max = 126;
        // min ascii value
        int min = 31;
        // intialises the random number
        int randomchar = 0;
        // intiallisese the start point of the array list generation

        // while loop to start generating the population
        for (int i = 0; i < size; i++) {
            // generates the random number
            randomchar = (int)(Math.random() * ((max - min) + 1)) + min;
            // from the random number generates a random character
            char toBeAdded = (char)randomchar;
            // adds the character
            listed.add(toBeAdded);
            // moves onto the next value to generate

        }
        this.list = listed;

    }

}
*/
