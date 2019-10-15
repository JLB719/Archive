//int localpartlocat = input.indexOf('@');
//String localpart = input.substring(0, localpartlocat);
// checks for invalid characters
/*char currentCharacter = input.charAt(i);
if ((currentCharacter == '.') || (currentCharacter == '_') ||
    (currentCharacter >= '0' && currentCharacter <= '9') ||
    (currentCharacter  >= '@' && currentCharacter <= 'Z') ||
    (currentCharacter >= 'a' && currentCharacter <= 'z') ) {
        localpartchar = true;
} else {
    localpartchar = false;
}
// checking for dot separtor
if (currentCharacter == '.') {
    // increases number of dots in stirng by one
    currentdotlocal++;
}
// checks if the dot appears mroe than once
if (currentdotlocal <= 1) {
    localpartdot = true;
} else {
    localpartdot = false;
}
// checks that both the separators and the characters are valid then returns true or false depending on the outcome
if (localpartdot == true && localpartchar == true) {
    localpartstring = true;
} else {
    localpartstring = false;
}
}
*/

        //String domainpart = input.substring(localpartlocat);
        /*for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            // checking the characters are valid
        if ((currentCharacter == '.') ||
        (currentCharacter >= 'a' && currentCharacter <= 'z')) {
            domainpartchar = true;
        } else {
            domainpartchar = false;
        }
        // checks if the the dot comes up
        if (currentCharacter == '.') {
            currentdotdomain++;
        }
        //limits the dot part to 2
        if (currentdotdomain >2) {
            domainpartdot = false;
        } else {
            domainpartdot = true;
        }
        //return domainpartdot;
        //return domainpartchar;

        //return localpartdot;
        //return localpartchar;
    }
    */
    // works out how long the domain lnegth should be and where it should stop
    /*
        if (domainlength == 2) {
            endinglocation = 2;

        } else if (domainlength ==3) {
            endinglocation = 3;

        }
    // checking for invalid charatesrs to start the string
    // need to write a program which once it has worked out where the invalid charater where the nearest ending is if there is one
    for(int j=0; j < inval.size(); j++) {
    locinvalpre1 = invalloc;
    char symbol = inval.get(j);
    // looking for the symbol location

    invalloc = input.indexOf(symbol, locinvalpre1);
    String email = input.substring(invalloc, endinglocation);
    boolean checked = emailCheck(email);
    if (checked == true) {
        list.add(email);
    }
    }
    // checks wehre there is a comon ending and tehn stops there
    // goes through then checks that the meail addres generated is correct

        while (invalloc > -1 && endinglocation > -1) {
            String email = input.substring(invalloc, endinglocation);
            boolean checked = emailCheck(input);
            if (checked == true) {
                list.add(email);
            }

        }

        /*
        int startpoint = input.indexOf(location);

        int start = input.indexOf(currentdomainendings[i]);
        while (location > -1) {
            String updomainpart = "";
            locationpre1 = location;
            String atSymbol = input.substring(locationpre1, location);
            list.add(atSymbol);
            //System.out.println(com);
            location = input.indexOf('@', (locationpre1 +1));
            if (input.contains("com") && (locationpre1 +1) != -1) {
                    int domaincom = input.indexOf("com", (locationpre1 +1));
                    String com = input.substring(location, domaincom);
                    updomainpart = com;
            } else if (input.contains("net") && (locationpre1 +1) != -1) {
                    int domainnet = input.indexOf("net", (locationpre1 + 1));
                    String net = input.substring(location, domainnet);
                    updomainpart = net;
            } else if (input.contains("uk") && (locationpre1 + 1) != -1) {
                    int domainuk = input.indexOf("uk", (locationpre1 + 1));
                    String uk = input.substring(location, domainuk);
                    updomainpart = uk;
            } else if (input.contains("de") && (locationpre1 + 1) != -1) {
                    int domainde = input.indexOf("de", (locationpre1 + 1));
                    String de = input.substring(location, domainde);
                    updomainpart = de;
            } else if (input.contains("jp") && (locationpre1 + 1) != -1) {
                    int domainjp = input.indexOf("jp", (locationpre1 + 1));
                    String jp = input.substring(location, domainjp);
                    updomainpart = jp;
            } else if (input.contains("ro") && (locationpre1 + 1) != -1) {
                    int domainro = input.indexOf("ro", (locationpre1 + 1));
                    String ro = input.substring(location, domainro);
                    updomainpart = ro;

            }


    }
    */
    // checks the email address is formated correctly

    // declares the initial condions ofr the space

    int location2 = 1;
    // while loop to find the spaces then check the emails
    /*
    while (location2 != -1) {

    int locationpre2 = location2;
    String emailspaceaddress = input.substring(locationpre2, location2);
    list.add(emailspaceaddress);
    location2 = input.indexOf(' ', (locationpre2 + 1));
    boolean checked = emailCheck(input);
    if (checked == true){
    list.add(emailspaceaddress);
    }



    }
    */
