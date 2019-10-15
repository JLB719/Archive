// package com.bham.pij.assignments.a1a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EmailAddressFinder {

    private static ArrayList<String> emailAddresses;

    public static void main(String[] args) {
        emailAddresses = new ArrayList<String>();
        EmailAddressFinder eaf = new EmailAddressFinder();
        eaf.run();
        System.out.println("Email addresses found: " + emailAddresses.size());
    }

    public void run() {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("corrupteddb"));

            String input = "";

            PrintWriter pw = new PrintWriter("eaf");

            while ((input = reader.readLine()) != null) {

                input = input.trim();

                ArrayList<String> temp = new ArrayList<String>();

                temp = findEmailAddresses(input);

                for (String t: temp) {
                    emailAddresses.add(t);
                }
            }

            pw.close();
            reader.close();
        }

        catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean domainCheck(String input) {
        int totalPeriods = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar == '.') {
                totalPeriods++;
            }
            if (!Character.isLowerCase(currentChar) && currentChar != '.') {
                return false;
            }
            // System.out.println(totalPeriods);
        }
        if (totalPeriods < 1 || totalPeriods > 2) {
            return false;
        }
        int indexOfEnd = input.lastIndexOf('.');
        String toLevel = input.substring((indexOfEnd + 1));
        if (!toLevel.equals("net") && !toLevel.equals("com") && !toLevel.equals("uk") && !toLevel.equals("de") && !toLevel.equals("jp") && !toLevel.equals("ro")) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean localCheck(String input) {
        int totalPeriods = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // System.out.println(currentChar);
            if (currentChar == '.') {
                totalPeriods++;
            }
            // System.out.println(Character.isAlphabetic(currentChar));
            if (totalPeriods > 1) {
                return false;
            }
            if (!Character.isLetterOrDigit(currentChar) && currentChar != '.') {
                return false;
            }
        }
        return true;

    }
    public static boolean Email(String input) {
        String[] splited = input.split("@");
        if (splited.length != 2) {
            return false;
        }
        if (localCheck(splited[0]) && domainCheck(splited[1])) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<String> findEmailAddresses(String input) {

        ArrayList<String> list = new ArrayList<String>();

        /*
         * Your code goes here.
         */
         String[] potentialAddress = input.split(" ");
         for (int i = 0; i < potentialAddress.length; i++) {
             String chunk = potentialAddress[i]
             if(Email(chunk)) {
                 System.out.println(chunk);
                 list.add(chunk);
             } else {
                 //split somewher
                 int position = 0;
                 int markPosition = 0;
                 while (position < chunk.length()) {
                     char sym = chunk.charAt(position);
                     if ((sym > 32 && sym < 46) || (sym == 47) || (sym > 57 && sym < 64) || (sym > 90 && sym < 96) || (sym > 122 && sym < 127)) {
                         markPosition = position;
                     }
                     if (sym == '@') {
                         int atPosition = position;
                         String check = chunk.substring(markPosition + 1, atPosition -1); // whil need to think about period character
                         if (localCheck(check)) {
                             int newPos = position + 1
                             while(newPos < chunk.length()) {
                             int dotCount = 0;
                             char marked = chunk.charAt(newPos);
                             if (marked == '.') {
                                 dotCount++;
                                 if (dotCount > 2) {
                                     // do something
                                 }
                                 String testdomain = chunk.substring(newPos + 1, newPos + 4);
                                 if (testdomain.contains("net") || testdomain.contains("com")) {
                                     String checkdo = chunk.substring(atPosition + 1, newPos + 4);
                                     if(domainCheck(checkdo)) {
                                         String wholeEmail = chunk.substring(markPosition + 1, newPos + 4);
                                         if (Email(wholeEmail)) {
                                             list.add(wholeEmail);
                                         }
                                     }

                             }
                         }
                     }
                 }
                 while (position < chunk.length()) {
                     char sym = potentialAddress[i].charAt(position);
                     if ((sym > 32 && sym < 46) || (sym == 47) || (sym > 57 && sym < 64) || (sym > 90 && sym < 96) || (sym > 122 && sym < 127)) {
                         markPosition = position;
                     } else if (sym == '@') {
                         int atPosition = position;
                         int dposition = position;
                         int dmarkPosition = markPosition;
                         String check = potentialAddress[i].substring(dmarkPosition, dposition);
                         if (localCheck(check)) {
                             // find index more complicated part
                             // could be done after marking posion after finding com
                             int dotCount = 0;
                             char marked = chunk.charAt(position);
                             while(position < chunk.length()) {
                             if (marked == '.') {
                                 dotCount++;
                                 int thirdPosition = position + 3;
                                 String domain = chunk.substring(position + 1, thirdPosition); // needs to be checked
                                 if (domain.contains("net") || domain.contains("com")) {
                                     String checkdo = chunk.substring(atPosition + 1, thirdPosition);
                                     if (domainCheck(checkdo)) {
                                         String fullEmail = chunk.substring(markPosition + 1, thirdPosition);
                                         list.add(fullEmail);
                                         break;
                                     }
                                 }
                                else if (domain.contains("uk") || domain.contains("ro") || domain.contains("de") || domain.contains("jp")) {
                                    int secondPosition = thirdPosition - 1;
                                    String checkdo = chunk.substring(atPosition + 1, secondPosition);
                                    if (domainCheck(checkdo)) {
                                        String fullEmail = chunk.substring(markPosition + 1, secondPosition);
                                        list.add(fullEmail);
                                        break;
                                    }
                                } else if (dotCount > 2) {
                                    break;
                                }
                            } else if (( marked > 32 && marked < 46) || (marked == 47) || (marked > 57 && marked < 64) || (marked > 90 && marked < 96) || (marked > 122 && marked < 127)) {
                                break;
                            }
                            position++;
                             }
                         }
                     }
                     position++;
                     }
                     }
                 }
                 return list;

             }
         }
