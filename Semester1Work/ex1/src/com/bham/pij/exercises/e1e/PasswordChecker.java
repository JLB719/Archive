package com.james.ex1.e;
import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner passwordinput = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = passwordinput.nextLine();
        System.out.println(checkPassword(password));

    }
    public static boolean passwordLength(String password) {
        if (password.length() < 8 || password.length() > 12) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean passwordValidCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentCharacter = password.charAt(i) ;
            if (Character.isDigit(currentCharacter) == false &&
                Character.isLetter(currentCharacter) == false &&
                currentCharacter != '_') {
                    return false;
                }

        }
        return true;

    }
    public static boolean startWithDigit(String password) {
        char currentCharacter = password.charAt(0);
        if (Character.isDigit(currentCharacter) == false) {
            return true;
        }
        return false;
    }
    public static boolean mixCharacter(String password) {
        boolean lowercase = false;
        boolean uppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char currentCharacter = password.charAt(i);
            String currentCharacterString = "" + currentCharacter;
            if (Character.isDigit(currentCharacter) == false && currentCharacter != '_') {
                if (currentCharacterString.equals(currentCharacterString.toUpperCase())) {
                    uppercase = true;
                }
                if (currentCharacterString.equals(currentCharacterString.toLowerCase())) {
                    lowercase = true;
                }
            }
            if (uppercase == true && lowercase == true) {
                return true;
            }
        }
        return false;
    }
    public static String checkPassword(String input) {
        if (passwordLength(input) == true &&
            passwordValidCharacters(input) == true &&
            startWithDigit(input) == true &&
            mixCharacter(input) == true) {
                return "OK";
            }
        String passwordLength = "";
        String passwordValidCharacters = "";
        String startWithDigit = "";
        String mixCharacter = "";
        if (passwordLength(input) == false) {
            passwordLength = "Your password was either to long or too short. ";
        }
        if (passwordValidCharacters(input) == false) {
            passwordValidCharacters = "There was atleast one invalid character. ";
        }
        if (startWithDigit(input) == false) {
            startWithDigit = "There was a digit at the start of the password. ";
        }
        if (mixCharacter(input) == false) {
            mixCharacter = "There was not a mix of upper and lowercase characters. ";
        }
        return passwordLength + passwordValidCharacters + startWithDigit + mixCharacter;
    }
}
