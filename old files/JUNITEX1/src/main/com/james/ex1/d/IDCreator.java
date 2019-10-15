package com.james.ex1.d;
import java.util.Scanner;
public class IDCreator {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = inputName.nextLine();
        System.out.println(createID(name));
    }
    public static String createID(String input) {
        if (input.equals("")) {
            return null;
        }
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char examine = input.charAt(i);
            if (examine == ' ') {
                spaceCount++;
            }
        }
        if (spaceCount <= 0 || spaceCount > 2) {
            return null;
        }
        if (spaceCount == 1) {
            char firstNameCharacter = input.charAt(0);
            String firstNameString = "" + firstNameCharacter;
            String lowerCaseFirstNameString = firstNameString.toLowerCase();
            int surnameCharacterPosition = input.indexOf(' ') + 1;
            char surnameCharacter = input.charAt(surnameCharacterPosition);
            String surnameString = "" + surnameCharacter;
            String lowerCaseSurnameString = surnameString.toLowerCase();
            String ID = lowerCaseFirstNameString + "x" + lowerCaseSurnameString;
            return ID;
        }
        if (spaceCount == 2) {
            char firstNameCharacter = input.charAt(0);
            String firstNameString = "" + firstNameCharacter;
            String lowerCaseFirstNameString = firstNameString.toLowerCase();
            int middleCharacterPosition = input.indexOf(' ') + 1;
            char middleNameCharacter = input.charAt(middleCharacterPosition);
            String middleNameString = "" + middleNameCharacter;
            String middleNameLowercase = middleNameString.toLowerCase();
            int surnameCharacterPosition = input.lastIndexOf(' ') + 1;
            char surnameCharacter = input.charAt(surnameCharacterPosition);
            String surnameString = "" + surnameCharacter;
            String surnameLowercase = surnameString.toLowerCase();
            String ID = lowerCaseFirstNameString + middleNameLowercase + surnameLowercase;
            return ID;
        }
        return null;
    }
}
