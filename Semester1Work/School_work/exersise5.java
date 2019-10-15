public class exersise5 {
  public static void main (String[] args) {
    int val1 = Integer.parseInt(args[0]);
    int val2 = Integer.parseInt(args[1]);
    int val3 = Integer.parseInt(args[2]);
    int val4 = Integer.parseInt(args[3]);
    int val5 = Integer.parseInt(args[4]);
    double meanVal = mean(val1, val2, val3, val4, val5);
    System.out.println("The mean value of the input value is " + meanVal);
    if (val1 < val2 && val2 < val3 && val3 < val4 && val4 < val5) {
      System.out.println("The values are in ascending order");
      int range = val5 - val1;
      System.out.println("The range is " + range);
    } else if (val5 < val4 && val4 < val3 && val3 < val2 && val2 < val1) {
      System.out.println("The values are in decending order");
      int range = val1 - val5;
      System.out.println("The range is " + range);
    } else {
    System.out.println("The values are neither in assending or descending order");
    }
  }

  public static double mean(int num1, int num2, int num3, int num4, int num5) {
    double result = (num1 + num2 + num3 + num4 + num5)/5.0;
    return result;
  }


}
