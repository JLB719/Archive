
import java.util.*;
public class TestClass {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	char a = 'A';
	int b = (int)a;
	System.out.println(b);
	int c = 54;
	char d = (char)c;
	System.out.println(d);
    }
    
    public static boolean areMirror(String s1, String s2) {
	if(s1 == null || s2 == null || (s1.length() != s2.length())) {
		return false;
	}
	int s2count = s2.length() - 1;
	for(int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i) != s2.charAt(s2count)) {
			return false;
		}
	s2count--;
	}

	return true;
}
    public static boolean isEven(int value) {
	if(value % 2 == 0) {
	    return true;
	} else {
	    return false;
	}
    }
    public static boolean contains(String input, char punctuationMark) {
	for(int i = 0; i < input.length(); i++) {
	    if(input.charAt(i) == punctuationMark) {
		return true;
	
	    }
	}
	return false;
    }

}
