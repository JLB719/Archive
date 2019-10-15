
public class methodCreate {

    public static boolean localCheck(String input) {
        int totalPeriods = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            System.out.println(currentChar);
            if (currentChar == '.') {
                totalPeriods++;
            }
            System.out.println(Character.isAlphabetic(currentChar));
            if (totalPeriods > 1) {
                return false;
            }
            if (!Character.isLetterOrDigit(currentChar) && currentChar != '.') {
                return false;
            }
        }
        return true;

}
    public static boolean domainCheck(String input) {
        int totalPeriods = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar == '.') {
                totalPeriods++;
            }
            if (!Character.isLowerCase(currentChar) && currentChar != '.') {
                return false;
            }
            System.out.println(totalPeriods);
        }
        if (totalPeriods < 1 || totalPeriods > 2) {
            return false;
        }
        int indexOfEnd = input.lastIndexOf('.');
        String toLevel = input.substring((indexOfEnd + 1));
        if (!toLevel.equals("net") && !toLevel.equals("com") && !toLevel.equals("uk") && !toLevel.equals("de") && !toLevel.equals("jp") && !toLevel.equals("ro")) {
            return false;
        } else {
            return true;
        }

    }
    public static void main(String[] args) {
        String test = "343.cmes@l;jl;kj";
        String print = test.substring(3 + 1, 11 -1);
        int dotPos = test.indexOf('.');
        System.out.println(test.charAt(dotPos + 3));
        System.out.println(test.substring(dotPos + 1, dotPos + 4));
        System.out.println(test.contains("com"));
        String nullString = null;
        System.out.println(nullString);

    }
}
