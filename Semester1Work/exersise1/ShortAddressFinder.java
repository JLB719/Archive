package com.bham.pij.exercises.e1f;
import java.util.Scanner;
public class ShortAddressFinder {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter address with the last part being the postcode");
    String address = in.nextLine();
    String shortlineaddress = findShortAddress(address);
    System.out.println(shortlineaddress);
  }
  public static String findShortAddress(String input) {
    String shortaddress = "";
    int locationpre = 1;
    int location = 1;
    while (location != -1) {
    locationpre = location;
    location = input.indexOf(',', (locationpre + 1));
    }
    int finalcomma = locationpre;
    int firstcomma = input.indexOf(',');
    String address1 = input.substring(0, (firstcomma));
    String postcode = input.substring(locationpre + 2);
    shortaddress = address1 + " " + postcode;
    char firstcharacter = postcode.charAt(0);
    char secondcharacter = postcode.charAt(1);
    char thirdcharacter = postcode.charAt(2);
    char fourthcharacter = postcode.charAt(3);
    char fifthcharacter = postcode.charAt(4);
    char sixthcharacter = postcode.charAt(5);
    String postcodecheck;
    if ((postcode.length() == 6) && Character.isLetter(firstcharacter) &&
                Character.isDigit(secondcharacter) &&
                Character.isDigit(thirdcharacter) &&
                Character.isDigit(fourthcharacter) &&
                Character.isLetter(fifthcharacter) &&
                Character.isLetter(sixthcharacter)) {
        postcodecheck = shortaddress;
        return postcodecheck;
    } else {
        postcodecheck = "null";
        return postcodecheck;
    }


    }
  }
