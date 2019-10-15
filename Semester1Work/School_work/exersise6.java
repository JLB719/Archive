public class exersise6 {
  public static void main(String[] args) {
    String letter1 = args[0];
    int number = Integer.parseInt(args[1]);
    if (letter1.equals("f")) {
      double far = (number * 9/5) + 32;
      System.out.println(number + " converted to farenheit is " + far);
    } else if (letter1.equals("c")) {
      double cel = (number - 32) * 5/9;
      System.out.println(number + " converted to celcius is " + cel);
    } else {
      System.out.println("Invalid letter entered");
    }
  }
}
