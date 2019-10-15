import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class secretSanta {
    public static void main(String[] args) {
        // entering the names and email addresses

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namescopy = new ArrayList<String>();
        ArrayList<String> emails = new ArrayList<String>();
        ArrayList<String> newnames = new ArrayList<String>();

        String name = "";
        String email = "";
        while (!name.equals("y") ||!email.equals("y")) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter peoples names enter the y key when finished");

          name = in.nextLine();
         names.add(name);
         Scanner in2 = new Scanner(System.in);
         System.out.println("Enter peoples emails entered the y key when finished");
         email = in2.nextLine();
         emails.add(email);

    }
    //list.remove(0);

    int sizeNames = names.size();
    int actualnamessize = sizeNames - 1;
    names.remove(sizeNames-1);
    int sizeEmails = emails.size();
    emails.remove(sizeEmails-1);
    int randomNumber;
    String toBeAddedToList = "";
    namescopy.addAll(names);

    
    while (namescopy.size() > 0) {
        Random randomGenerate = new Random();
        randomNumber = (randomGenerate.nextInt(actualnamessize));
        toBeAddedToList = namescopy.get(randomNumber);
        actualnamessize--;

        newnames.add(toBeAddedToList);
        namescopy.remove(randomNumber);





    }
    int i = 0;
    while (i < emails.size()) {
        String individaulemail = emails.get(i);
        String individualnames = newnames.get(i);
        System.out.println("An email will be sent to " + individaulemail + " and will be asked to give a gift to " + individualnames + ".");
        i++;
    }


    // randomising the ArrayList


    }
}
