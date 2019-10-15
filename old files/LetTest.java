import java.util.Scanner;
import java.util.ArrayList;
public class LetTest {
    public boolean BlackOrNot (float[] sample) {
        float blackVariant = 0.015
        if (sample[0] < blackVariant && sample[1] < blackVariant && sample[2] < blackVariant) {
            return true;
        } else {
            return false;
        }
    }
    
}
