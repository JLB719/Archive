//package com.bham.pij.assignments.assignment1;

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
    // checks if the local part is correct
    public static boolean localPartCheck(String input) {
        // declaration of variables
        boolean localpart = false;
        boolean separatorCorrect = false;
        boolean invalidcharacterlocal = false;
        boolean lettercheck = false;
        boolean digitcheck = false;
        boolean topleveldomain = false;
        char charactercurrent;
        int separator = 0;
        int checkseparator = 0;
        // for loop to check if the character is an invalid character
        for (int i = 0; i < input.length(); i++) {
            charactercurrent = input.charAt(i);
            if (Character.isDigit(charactercurrent) ||
            Character.isLetter(charactercurrent) ||
            charactercurrent == '_' || charactercurrent == '.') {
                i++;
                invalidcharacterlocal = true;
            } else {
                invalidcharacterlocal = false;

            }
        }
// checking where the position of the separtor is then making sure it doesn't go above 0
        separator = input.indexOf('.');
        if (input.indexOf('.') == -1) {
            separatorCorrect = true;
        } else if (input.indexOf('.') != -1) {
            checkseparator = input.indexOf('.', separator);
        }
        if (checkseparator == -1) {
            separatorCorrect = true;
        } else {
            separatorCorrect = false;
        }
// checks that both conditions are true then returns a true value if it is correct
    if ((separatorCorrect == true) && (invalidcharacterlocal != true)) {
        localpart = true;
    } else if (localpart == false || invalidcharacterlocal == false) {

    }
    return localpart;
}
        // checking the domain part is valid
        public static boolean domainPartCheck(String input) {
            // variable declaration
            // some variables delcared may be unessessary
        boolean domainpart = false;
        boolean domainpartstring = false;
        boolean domainpartchar = false;
        boolean domainlowercase = false;
        boolean topleveldomain = false;
        boolean domainSeparatorCorrect = false;
        boolean invalidcharacterlocal = false;
        int separatordomain = 0;
        int secondseparatordomain = 0;
        int thirdseparatordomain = 0;
        char charactercurrent;
        // checks the separator to check it is correct
        separatordomain = input.indexOf('.');
        if (separatordomain != -1) {
            secondseparatordomain = input.indexOf('.', separatordomain);
        } else {
            domainSeparatorCorrect = false;
            return domainSeparatorCorrect;
        }
        if (secondseparatordomain != -1) {
            thirdseparatordomain = input.indexOf('.', secondseparatordomain);
        }
        if (thirdseparatordomain != -1) {
            domainSeparatorCorrect = false;
        } else {
            domainSeparatorCorrect = true;
        }
        // checks the format of the domain is correct
        if (input.equals((input.toLowerCase())) ) {
         domainlowercase = true;
     } else {
         domainlowercase = false;
     }
     for (int i = 0; i < input.length(); i++) {
         charactercurrent = input.charAt(i);
         if (Character.isDigit(charactercurrent) ||
         Character.isLetter(charactercurrent) ||
          charactercurrent == '.') {
             i++;
             invalidcharacterlocal = true;
         } else {
             invalidcharacterlocal = false;
             return invalidcharacterlocal;
         }
     }
     // checks for the top level domain
     if (input.contains(".com") ||
     input.contains(".net") ||
     input.contains(".uk") ||
     input.contains(".ro") ||
     input.contains(".jp") ||
     input.contains(".de")) {
         topleveldomain = true;

     } else {
         topleveldomain = false;
     }

        // checking the domain contains one of the requried endings

// checks all the above conditions are true then validates the email address
        if ((domainSeparatorCorrect == true) &&
        (domainlowercase == true) && (topleveldomain == true) && (invalidcharacterlocal == true)) {
            domainpart = true;
            return domainpart;

        } else {
            domainpart = false;
            return domainpart;
        }
    }
    public ArrayList<String> findEmailAddresses(String input) {
        ArrayList<String> list = new ArrayList<String>();
        int endinglocation = 0;
        int domainlength = 1;
        int atLocation = 1;
        int mainSeparator = 1;
        int symbollocation = 0;
        int lastAt = 0;
        int firstSep = 0;
        int secondSep = 0;
        int position = 1;
        int totalstringlength = input.length();
        int netextract = 0;
        int ukextract = 0;
        int deextract = 0;
        int jpextract = 0;
        int roextract = 0;
        int comextract = 0;
        int startofstring = 0;
        int potentiallocation = 0;
        String localPartExtract = "";
        String domainPartExtract = "";
        String separatorContain = "";
        String emailfind = "";
        String localPartPreviousUK = "";
        String localPartPreviousDe = "";
        String localPartPreviousJp = "";
        String localPartPreviousRo = "";
        String localPartPreviousNet = "";
        String localPartPreviousCom = "";
        String mainlocalextract = "";
        boolean localcheck = false;
        boolean domaincheck = false;
        boolean localUKCheck = false;
        boolean localDeCheck = false;
        boolean localcomcheck = false;
        boolean localRoCheck = false;
        boolean localJpCheck = false;
        boolean underscore = false;
        boolean localnetcheck = false;
        boolean dot = false;
        char currentCharacter = 'a';

        // loop which keeps searching for ats to divide into substring
        while ((atLocation > 0) && ((totalstringlength-1) > atLocation)){
            atLocation = lastAt;
            atLocation = input.indexOf('@', lastAt);
            // for loop going throguh invalid characters trying to dind subsrings of valid local parts
             while ((potentiallocation > lastAt) && (potentiallocation !=-1) && (potentiallocation < totalstringlength)) {
                 potentiallocation = atLocation;
                 potentiallocation--;
                 currentCharacter = input.charAt(potentiallocation);
                 boolean digit = Character.isDigit(currentCharacter);
                 boolean letter = Character.isDigit(currentCharacter);
                 if(currentCharacter == '_') {
                     underscore = true;
                 } else {
                     underscore = false;
                 }
                 if(currentCharacter == '.') {
                     dot = true;
                 } else {
                     dot = false;
                 }
                 if (digit == false && letter == false && underscore == true && dot == true) {
                     startofstring = currentCharacter;
                     potentiallocation = 0;
                     break;
             } else {
                 continue;
             }
         }
             localPartExtract = input.substring((startofstring + 1), atLocation);
             //symbollocation = input.lastIndexOf(startofstring, '@');
             localcheck = localPartCheck(localPartExtract);
             // loosk for where the at symbol is comared to a symbol not allowed
// creates subsring of the local part
                      localPartPreviousCom = input.substring((comextract+ 1), atLocation);
                      localPartPreviousNet = input.substring((netextract + 1), atLocation);
                      localPartPreviousUK = input.substring((ukextract + 1), atLocation);
                      localPartPreviousDe = input.substring((deextract + 1), atLocation);
                      localPartPreviousJp = input.substring((jpextract + 1), atLocation);
                      localPartPreviousRo = input.substring((roextract + 1), atLocation);
                      // checks the local part is valid
                      localcomcheck = localPartCheck(localPartPreviousCom);
                      localnetcheck = localPartCheck(localPartPreviousNet);
                      localUKCheck = localPartCheck(localPartPreviousUK);
                      localDeCheck = localPartCheck(localPartPreviousDe);
                      localJpCheck = localPartCheck(localPartPreviousJp);
                      localRoCheck = localPartCheck(localPartPreviousRo);
// once local part correct starts looking for domain part
                     if (localcheck == true) {
                         mainlocalextract = localPartExtract;
                     } else if (localcomcheck == true) {
                         mainlocalextract = localPartPreviousCom;
                     } else if (localnetcheck == true) {
                         mainlocalextract = localPartPreviousNet;
                     } else if (localUKCheck == true) {
                         mainlocalextract = localPartPreviousUK;
                     } else if (localJpCheck == true) {
                         mainlocalextract = localPartPreviousJp;
                     } else if (localDeCheck == true) {
                         mainlocalextract = localPartPreviousDe;
                     } else if (localRoCheck == true) {
                         mainlocalextract = localPartPreviousRo;
                     }else {
                     break;
                 }
// identifiing the separor and where they are
                        if (input.contains(".com")) {
                            firstSep = input.indexOf('.', atLocation);
                           secondSep = input.indexOf('.', firstSep);
                           // creats a subsirng so that the top level can be checked
                           if (firstSep < totalstringlength && secondSep < totalstringlength) {
                            separatorContain = input.substring(firstSep, secondSep);
                            // if the top level isnt between the subring know it s after and know direclty afeer second separator
                           if (separatorContain.contains("com") == false) {
                               // declares the main separator as the second separator
                                mainSeparator = secondSep;
                           // if this is true know the top levle odmain is afer the second separator
                           } else if (separatorContain.contains("com") == true) {
                                mainSeparator = firstSep;
                           } else {
                           domaincheck = false;
                       }
                   }
                          position = input.indexOf('m', atLocation);
                          domainPartExtract = input.substring((atLocation + 1), position);
                          domaincheck = domainPartCheck(domainPartExtract);
                      } else {
                          continue;
                      }
                         if (domaincheck == true) {
                               emailfind = mainlocalextract + "@" + domainPartExtract;
                               comextract = position;
                              list.add(emailfind);
                          } else {
                              continue;
                          }
                            if (input.contains(".net")) {
                                firstSep = input.indexOf('.', atLocation);
                                secondSep = input.indexOf('.', firstSep);
                                if (firstSep < totalstringlength && secondSep < totalstringlength) {
                                separatorContain = input.substring(firstSep, secondSep);
                               if (separatorContain.contains("net") == false) {
                                 mainSeparator = secondSep;
                             } else if(separatorContain.contains("net") == true) {
                                 mainSeparator = firstSep;
                               } else {
                               domaincheck = false;
                           }
                       }
                                 position = input.indexOf('t', atLocation);
                                 domainPartExtract = input.substring((atLocation + 1), position);
                                 domaincheck = domainPartCheck(domainPartExtract);
                             } else {
                                 continue;
                             }
                                if (domaincheck == true) {
                                      emailfind = mainlocalextract + "@" + domainPartExtract;
                                      netextract = position;
                                    list.add(emailfind);
                                } else {
                                    break;
                                }
                                    if (input.contains(".uk")) {
                                        firstSep = input.indexOf('.', atLocation);
                                        secondSep = input.indexOf('.', firstSep);
                                        separatorContain = input.substring(firstSep, secondSep);
                                        if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                       if (separatorContain.contains("uk") == false) {
                                            mainSeparator = secondSep;
                                       } else if (separatorContain.contains("uk") == true) {
                                            mainSeparator = firstSep;
                                       } else {
                                       domaincheck = false;
                                   }
                               }
                                         position = input.indexOf('k', atLocation);
                                        domainPartExtract = input.substring((atLocation + 1), position);
                                         domaincheck = domainPartCheck(domainPartExtract);
                                     } else {
                                         continue;
                                     }
                                        if (domaincheck == true) {
                                              emailfind = mainlocalextract + "@" + domainPartExtract;
                                              ukextract = position;
                                            list.add(emailfind);

                                    } else {
                                        break;
                                    }
                                    if (input.contains(".de")) {
                                        firstSep = input.indexOf('.', atLocation);
                                        secondSep = input.indexOf('.', firstSep);
                                        separatorContain = input.substring(firstSep, secondSep);
                                        if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                       if (separatorContain.contains("de") == false) {
                                            mainSeparator = secondSep;
                                       } else if(separatorContain.contains("de") == true) {
                                            mainSeparator = firstSep;
                                       } else {
                                       domaincheck = false;
                                   }
                               }
                                         position = input.indexOf('e', atLocation);
                                         domainPartExtract = input.substring((atLocation + 1), position);
                                         domaincheck = domainPartCheck(domainPartExtract);
                                     } else {
                                         continue;
                                     }
                                        if (domaincheck == true) {
                                            emailfind = mainlocalextract + "@" + domainPartExtract;
                                            deextract = position;
                                            list.add(emailfind);

                                        } else {
                                            break;
                                        }
                                        if (input.contains(".jp")) {
                                            firstSep = input.indexOf('.', atLocation);
                                            secondSep = input.indexOf('.', firstSep);
                                            separatorContain = input.substring(firstSep, secondSep);
                                            if (firstSep < totalstringlength && secondSep < totalstringlength) {
                                           if (separatorContain.contains("jp") == false) {
                                                mainSeparator = secondSep;
                                           } else if (separatorContain.contains("jp") == true) {
                                                mainSeparator = firstSep;
                                           } else {
                                           domaincheck = false;
                                       }
                                   }
                                            position = input.indexOf('p', atLocation);
                                             emailfind = input.substring((atLocation + 1), position);
                                             domaincheck = domainPartCheck(domainPartExtract);
                                         } else {
                                             continue;
                                         }
                                            if (domaincheck == true) {
                                                 emailfind = mainlocalextract + "@" + domainPartExtract;
                                                 jpextract = position;
                                                list.add(emailfind);
                                            } else {
                                                break;
                                            }
                                            if (input.contains(".ro")) {
                                                firstSep = input.indexOf('.', atLocation);
                                                secondSep = input.indexOf('.', firstSep);
                                                separatorContain = input.substring(firstSep, secondSep);
                                                if (firstSep < totalstringlength || secondSep < totalstringlength) {

                                               if (separatorContain.contains("ro") == false) {
                                                    mainSeparator = secondSep;
                                               } else if(separatorContain.contains("ro") == true) {
                                                    mainSeparator = firstSep;
                                               } else {
                                               domaincheck = false;
                                           }
                                       }
                                                 position = input.indexOf('o', atLocation);
                                                domainPartExtract = input.substring((atLocation + 1), position);
                                                 domaincheck = domainPartCheck(domainPartExtract);
                                             } else {
                                                     continue;
                                                 }
                                                if (domaincheck == true) {
                                                 emailfind = mainlocalextract + "@" + domainPartExtract;
                                                 roextract = position;
                                                    list.add(emailfind);
                                                }
                                                // attempt to break out of loop when it needs to

                                            }
                                            return list;
                                        }                
    }
