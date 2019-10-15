package com.bham.pij.exercises.e1e;
import java.util.Scanner;
public class PasswordChecker {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a password");
    String input = in.nextLine();
    int passwordlen = input.length();

    String checked = checkPassword(input);
    if (checked.equals("OK")) {
        System.out.println("OK");
    } else {
        System.out.println("null");
    }
}
public static boolean isuppercase(String input) {


            boolean uppercase;

              if (!input.equals(input.toUpperCase())) {
                  uppercase = true;
                  return uppercase;

              } else {
                  uppercase = false;
                  return uppercase;
              }


      }
    public static boolean islowercase(String input) {

            boolean lowercase;

                if (!input.equals(input.toLowerCase())) {
                   lowercase = true;
                   return lowercase;

            } else {
                lowercase = false;
                return lowercase;
            }


    }
    public static boolean issymbols(String input) {

        boolean symbol = true;
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);

            if ((currentCharacter <= '0' &&  currentCharacter >= '9') &&
                        ( currentCharacter <= 'A' &&  currentCharacter >= 'Z') &&
                        ( currentCharacter != '_') &&
                        (currentCharacter <= 'a' &&  currentCharacter >= 'z')  ) {
                        symbol = false;
                        return symbol;
                    } else {
                        symbol = true;
                        return symbol;
                    }
    }
        return symbol;
    }
    public static boolean length(String input) {
        boolean length;
        if (input.length() >= 8 && input.length() <= 12) {
          length = true;
          return length;
      } else {
          length = false;
          return length;
      }

  }
  public static boolean isdigit(String input) {
      boolean digit;
      char firstletter = input.charAt(0);
      if (!Character.isDigit(firstletter)) {
          digit = true;
          return digit;
      } else {
          digit = false;
          return digit;
      }

  }





    public static String checkPassword(String input) {
    String result;

    boolean digit = isdigit(input);
    boolean length = length(input);
    boolean symbol = issymbols(input);
    boolean lowercase = islowercase(input);
    boolean uppercase = isuppercase(input);
    if (digit == true &&
        length == true &&
        symbol == true &&
        lowercase == true &&
        uppercase == true) {
            result = "OK";
            return result;
        } else {
            result = "null";
            return result;
        }





  }
  }
