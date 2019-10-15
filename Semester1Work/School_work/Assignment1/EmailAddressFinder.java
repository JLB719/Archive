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
    // checking conditions which make an email address an email address
    public static boolean localPartCheck(String input) {
        // declaration of variables
        boolean localpart = false;
        int dotcharacter = 0;
        boolean separatorCorrect = false;
        int dotcharactercount = 0;
        boolean invalidcharacterlocal = false;
        boolean lettercheck = false;
        boolean digitcheck = false;
        char charactercurrent = 'a';


        for (int l = 0; l < input.length(); l++) {
             charactercurrent = input.charAt(l);
            lettercheck = Character.isLetter(charactercurrent);
            digitcheck = Character.isDigit(charactercurrent);
        }
        if ((lettercheck == false && digitcheck == false) && (charactercurrent != '_') && (charactercurrent != '.')) {
            invalidcharacterlocal = false;

        } else {
            invalidcharacterlocal = true;

        }

        while(dotcharacter != -1) {
            dotcharacter = input.indexOf('.');
            dotcharactercount++;

        }
        if ((dotcharactercount > 0) && (dotcharactercount < 2) ) {
            separatorCorrect = true;
        } else {
            separatorCorrect = false;
        }


    if ((separatorCorrect == true) && (invalidcharacterlocal == true)) {
        localpart = true;
        return localpart;
    } else {
        localpart = false;
        return localpart;
    }
}

        // checking the domain part is valid
        public static boolean domainPartCheck(String input) {
        boolean domainpart = false;
        boolean domainpartstring = false;
        boolean domainpartchar = false;
        boolean domainlowercase = false;
        int domaindotcharacter = 0;
        int domaindotcharactercount = 0;
        boolean domainSeparatorCorrect = false;
        while (domaindotcharacter != -1) {
            domaindotcharacter = input.indexOf('.');
            domaindotcharactercount++;
        }
        if ((domaindotcharactercount > 0) && (domaindotcharactercount < 3)) {
            domainSeparatorCorrect = true;
        } else {
            domainSeparatorCorrect = false;
        }
        if (input.equals((input.toLowerCase())) ) {
         domainlowercase = true;
     } else {
         domainlowercase = false;
     }



        // checking the domain contains one of the requried endings
        if (input.contains("net") ||
                    input.contains("com") ||
                    input.contains("uk") ||
                    input.contains("de") ||
                    input.contains("jp") ||
                    input.contains("ro")) {
                        domainpartstring = true;
                        //return domainpartstring;
                    } else {
                        domainpartstring = false;
                        //return domainpartstring;
                    }
// checks all the above conditions are true then validates the email address
        if ((domainSeparatorCorrect == true) &&
        (domainlowercase == true) &&
        (domainpartstring == true)) {
            domainpart = true;
            return domainpart;

            //return emailaddressisthere;
        } else {
            domainpart = false;
            return domainpart;
            //return emailaddressisthere;
        }

    }



    public ArrayList<String> findEmailAddresses(String input) {

        ArrayList<String> list = new ArrayList<String>();
        // check for invalid Character

        // genereates the invalid characters into an array


        // declares intial varable
        int endinglocation = 0;
        int domainlength = 1;
        boolean localcheck = false;
        int atLocation = 1;
        int mainSeparator = 1;
        String localPartExtract = "";
        String domainPartExtract = "";
        int symbollocation = 0;
        int lastAt = 0;
        int firstSep = 0;
        int secondSep = 0;
        String separatorContain = "";
        String emailfind = "";
        boolean domaincheck = false;
        int position = 1;
        int totalstringlength = input.length();
        String localPartPreviousUK = "";
        String localPartPreviousDe = "";
        String localPartPreviousJp = "";
        String localPartPreviousRo = "";
        String localPartPreviousNet = "";
        String localPartPreviousCom = "";
        int netextract = 0;
        int ukextract = 0;
        int deextract = 0;
        int jpextract = 0;
        int roextract = 0;
        int comextract = 0;
        boolean localUKCheck = false;
        boolean localDeCheck = false;
        boolean localcomcheck = false;
        boolean localRoCheck = false;
        boolean localJpCheck = false;
        boolean localnetcheck = false;
        String mainlocalextract = "";
        char currentCharacter = 'a';
        int startofstring = 0;



         domainlength = 0;

        // loop which keeps searching for ats to divide into substring

        while ((atLocation > 0) && (totalstringlength > atLocation)){
            // for loop going throguh invalid characters trying to dind subsrings of valid local parts



            atLocation = input.indexOf('@', lastAt);
             lastAt = atLocation;
             while ((atLocation > lastAt) && (atLocation !=-1) && (atLocation < totalstringlength)) {
                 atLocation--;
                 currentCharacter = input.charAt(atLocation);
                 boolean digit = Character.isDigit(currentCharacter);
                 boolean letter = Character.isDigit(currentCharacter);

                 if ((digit == false && letter == false) && currentCharacter != '_' && currentCharacter != '.') {
                     startofstring = currentCharacter;




                 } else {
                     continue;
                 }

             }
             symbollocation = input.lastIndexOf(startofstring, '@');
             localPartExtract = input.substring((symbollocation + 1), atLocation);
             localcheck = localPartCheck(localPartExtract);
             atLocation = lastAt;
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
                     }

// identifiing the separor and where they are
                                 firstSep = input.indexOf('.', atLocation);
                                secondSep = input.indexOf('.', firstSep);
                                // creats a subsirng so that the top level can be checked
                                if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                 separatorContain = input.substring(firstSep, secondSep);
                                 // if the dop level isnt between the subring know it s after and know direclty afeer second separator
                                if (separatorContain.contains("com") == false) {
                                    // declares the main separator as the second separator
                                     mainSeparator = secondSep;
                                // if this is true know the top levle odmain is afer the second separator
                                } else if (separatorContain.contains("com") == true) {

                                     mainSeparator = firstSep;
                                }
                            } else {
                                break;
                            }
                        if (input.contains("com")) {
                          position = input.indexOf('m', mainSeparator);
                          domainPartExtract = input.substring((atLocation + 1), position);
                          domaincheck = domainPartCheck(domainPartExtract);
                      } else {
                          continue;
                      }
                         if (domaincheck == true) {
                               emailfind = mainlocalextract + "@" + domainPartExtract;
                               comextract = position;
                              list.add(emailfind);
                              input = input.substring(position);

                          } else {
                              break;
                          }
                                 firstSep = input.indexOf('.', atLocation);
                                 secondSep = input.indexOf('.', firstSep);
                                 if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                 separatorContain = input.substring(firstSep, secondSep);
                                if (separatorContain.contains("net") == false) {
                                  mainSeparator = secondSep;
                              } else if(separatorContain.contains("net") == true) {
                                  mainSeparator = firstSep;
                                }
                            } else {
                                break;
                            }
                            if (input.contains("net")) {
                                 position = input.indexOf('t', mainSeparator);
                                 domainPartExtract = input.substring((atLocation + 1), position);
                                 domaincheck = domainPartCheck(domainPartExtract);
                             } else {
                                 continue;
                             }
                                if (domaincheck == true) {
                                      emailfind = mainlocalextract + "@" + domainPartExtract;
                                      netextract = position;
                                    list.add(emailfind);
                                    input = input.substring(position);

                                } else {
                                    break;
                                }


                                         firstSep = input.indexOf('.', atLocation);
                                         secondSep = input.indexOf('.', firstSep);
                                         separatorContain = input.substring(firstSep, secondSep);
                                         if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                        if (separatorContain.contains("uk") == false) {
                                             mainSeparator = secondSep;
                                        } else if (separatorContain.contains("uk") == true) {
                                             mainSeparator = firstSep;
                                        }
                                    } else {
                                        break;
                                    }
                                    if (input.contains("uk")) {
                                         position = input.indexOf('k', mainSeparator);

                                        domainPartExtract = input.substring((atLocation + 1), position);
                                         domaincheck = domainPartCheck(domainPartExtract);
                                     } else {
                                         continue;
                                     }
                                        if (domaincheck == true) {
                                              emailfind = mainlocalextract + "@" + domainPartExtract;
                                              ukextract = position;
                                            list.add(emailfind);
                                            input = input.substring(position);

                                    } else {
                                        break;
                                    }


                                         firstSep = input.indexOf('.', atLocation);
                                         secondSep = input.indexOf('.', firstSep);
                                         if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                         separatorContain = input.substring(firstSep, secondSep);
                                        if (separatorContain.contains("de") == false) {
                                             mainSeparator = secondSep;
                                        } else if(separatorContain.contains("de") == true) {
                                             mainSeparator = firstSep;
                                        }
                                    } else {
                                        break;
                                    }
                                    if (input.contains("de")) {

                                         position = input.indexOf('e', mainSeparator);
                                         domainPartExtract = input.substring((atLocation + 1), position);
                                         domaincheck = domainPartCheck(domainPartExtract);
                                     } else {
                                         continue;
                                     }
                                        if (domaincheck == true) {
                                            emailfind = mainlocalextract + "@" + domainPartExtract;
                                            deextract = position;
                                            list.add(emailfind);
                                            input = input.substring(position);

                                        } else {
                                            break;
                                        }



                                             firstSep = input.indexOf('.', atLocation);
                                             secondSep = input.indexOf('.', firstSep);
                                             separatorContain = input.substring(firstSep, secondSep);
                                             if (firstSep < totalstringlength && secondSep < totalstringlength) {
                                            if (separatorContain.contains("jp") == false) {
                                                 mainSeparator = secondSep;
                                            } else if (separatorContain.contains("jp") == true) {
                                                 mainSeparator = firstSep;
                                            }
                                        } else {
                                            break;
                                        }
                                        if (input.contains("jp")) {
                                            position = input.indexOf('p', mainSeparator);
                                             emailfind = input.substring((atLocation + 1), position);
                                             domaincheck = domainPartCheck(domainPartExtract);
                                         } else {
                                             continue;
                                         }
                                            if (domaincheck == true) {
                                                 emailfind = mainlocalextract + "@" + domainPartExtract;
                                                 jpextract = position;
                                                list.add(emailfind);
                                                input = input.substring(position);

                                            } else {
                                                break;
                                            }

                                                 firstSep = input.indexOf('.', atLocation);
                                                 secondSep = input.indexOf('.', firstSep);
                                                 if (firstSep < totalstringlength || secondSep < totalstringlength) {
                                                 separatorContain = input.substring(firstSep, secondSep);
                                                if (separatorContain.contains("ro") == false) {
                                                     mainSeparator = secondSep;
                                                } else if(separatorContain.contains("ro") == true) {
                                                     mainSeparator = firstSep;
                                                }
                                            } else {
                                                break;
                                            }
                                            if (input.contains("ro")) {
                                                 position = input.indexOf('o', mainSeparator);
                                                domainPartExtract = input.substring((atLocation + 1), position);
                                                 domaincheck = domainPartCheck(domainPartExtract);
                                             }else {
                                                     continue;
                                                 }
                                                if (domaincheck == true) {
                                                 emailfind = mainlocalextract + "@" + domainPartExtract;
                                                 roextract = position;
                                                    list.add(emailfind);
                                                    input = input.substring(position);

                                                }
                                            }
                                                return list;
                                            }



                                        }
