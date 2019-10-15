import java.util.*;
import java.lang.Math;
public class ArrayTest {
    public static void main(String[] args) {
    ArrayList<String> binaryList = new ArrayList<String>();
    binaryList.add("-1");
    binaryList.add("-6");
    binaryList.add("0");
    binaryList.add("-89");
    binaryList.add("-9");
    binaryList.add("-8");
    binaryList.add("-23");
    binaryList.add("-34");
    binaryList.add("-45");
    binaryList.add("-4");
    System.out.println(binaryList);
    Collections.sort(binaryList);
    System.out.println(binaryList);
}
}
    /*
    int sizeOfChromosome = 4;
    for (int i = 0; i < 400; i++) {
        double randomnumber = Math.random();
        if (randomnumber < 0.5) {
            binaryList.add('0');
        }
        if (randomnumber >= 0.5) {
            binaryList.add('1');
        }
    }
    System.out.println(binaryList);
    ArrayList<String> Stringlist = new ArrayList<String>();
    String tobeincluded = "";
    int j = 0;
    int i = 0;
    while(i < binaryList.size()) {
        while(j < sizeOfChromosome) {
            char add = binaryList.get(i);
            tobeincluded = tobeincluded + add;
            j++;
        }
        Stringlist.add(tobeincluded);
        tobeincluded = "";
        j = 0;
        i = i + sizeOfChromosome;

    }
    System.out.println(Stringlist);
}
}
*/
