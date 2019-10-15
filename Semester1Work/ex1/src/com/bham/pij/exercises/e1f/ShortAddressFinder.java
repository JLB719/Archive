package com.james.ex1.f;
import java.util.Scanner;
public class ShortAddressFinder {
    public static void main(String[] args) {
        Scanner addressinput = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = addressinput.nextLine();

        System.out.println(findShortAddress(address));
    }
    public static boolean postcodeCheck(String address) {
        if (address.length() != 6) {
            return false;
        }
        char firstCharacter = address.charAt(0);
        if (Character.isLetter(firstCharacter) == false) {
            return false;
        }
        char secondCharacter = address.charAt(1);
        if (Character.isDigit(secondCharacter) == false) {
            return false;
        }
        char thirdCharacter = address.charAt(2);
        if (Character.isDigit(thirdCharacter) == false) {
            return false;
        }
        char fourthCharacter = address.charAt(3);
        if (Character.isDigit(fourthCharacter) == false) {
            return false;
        }
        char fifthCharacter = address.charAt(4);
        if (Character.isLetter(fifthCharacter) == false) {
            return false;
        }
        char sixthCharacter = address.charAt(5);
        if (Character.isLetter(sixthCharacter) == false) {
            return false;
        }
        return true;
    }
    public static String findShortAddress(String input) {
        int positionOfComma = input.indexOf(',');
        if (positionOfComma == -1) {
            return null;
        }
        String firstPartOfAddress = input.substring(0, positionOfComma);
        int postcodePosition = input.lastIndexOf(',');
        String postcode = input.substring((postcodePosition + 2));
        if (postcodeCheck(postcode) == true) {
            return firstPartOfAddress + " " + postcode;
        } else {
            return null;
        }
    }
}
