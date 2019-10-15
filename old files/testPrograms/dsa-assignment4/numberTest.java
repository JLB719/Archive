public class numberTest {
    public static void main(String[] args) {
        int firstNumber = 0000;
        // System.out.println(Integer.toString(firstNumber));
        // String numberString = "temp_00000_sample";

        // System.out.println(output);
        String numberString = "00000";
        String fileName = "sample";
        numberString = "00000";
        int outputInteger = Integer.parseInt(numberString);
        for (int i = 0; i < 100000; i++) {
            // int outputInteger = Integer.parseInt(numberString);
            // System.out.println(outputInteger);

            if (outputInteger < 10) {
                numberString = "0000" + Integer.toString(outputInteger);
            } else if (outputInteger < 100) {
                numberString = "000" + Integer.toString(outputInteger);
            } else if (outputInteger < 1000) {
                numberString = "00" + Integer.toString(outputInteger);
            } else if (outputInteger < 10000) {
                numberString = "0" + Integer.toString(outputInteger);
            } else if (outputInteger < 100000) {
                numberString = Integer.toString(outputInteger);
            }
            String build = "temp_" + numberString + "_sample";
            System.out.println(build);
            outputInteger = Integer.parseInt(numberString);
            outputInteger++;
        }
    }
}
