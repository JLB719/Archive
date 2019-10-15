package com.james.ex1.d;
import java.util.Scanner;
public class IDCreator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name");
    String input = in.nextLine();
    String IDCS = createID(input);

    System.out.println(IDCS);
  }
    public static String createID(String input) {
    String IDS = input;


    int spacePoss = input.indexOf(' ');

    int spacePoss2 = input.lastIndexOf(' ');
    if (spacePoss == -1) {
      String ID = "null";
      return ID;
    }

    String fname = input.substring(0, spacePoss);



     if (spacePoss != spacePoss2) {
      String firstname = input.substring(0, spacePoss);
      String middlename = input.substring((spacePoss + 1), spacePoss2);
      String lastname = input.substring((spacePoss2 + 1));
      char fu = firstname.charAt(0);
      char fl = Character.toLowerCase(fu);
      String fls = ("" + fl);
      char mu = middlename.charAt(0);
      char ml = Character.toLowerCase(mu);
      String mls = ("" + ml);
      char lu = lastname.charAt(0);
      char ll = Character.toLowerCase(lu);
      String lls = ("" + ll);
      String ID = (fls + mls + lls);
      return ID;

    } else if (spacePoss == spacePoss2){
      String firstname = input.substring(0, spacePoss);
      String lastname = input.substring((spacePoss + 1));
      char fu = firstname.charAt(0);
      char fl = Character.toLowerCase(fu);
      String fls = ("" + fl);
      char lu = lastname.charAt(0);
      char ll = Character.toLowerCase(lu);
      String lls = ("" + ll);
      String ID = (fls + 'x' + lls);
      return ID;

    }
      return IDS;



  }
}
