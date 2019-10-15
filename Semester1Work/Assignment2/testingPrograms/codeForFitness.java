public class codeForFitness {
    public static void main(String[] args) {




while(finishSubListPosition + 1 < (numberOfChromosomes * (chromosomeSize + 1))) {
        binaryOneCount = 0;
        ArrayList<Character> binarySubList = new ArrayList<Character>(binaryList.subList(startSubListPosition, finishSubListPosition+1));
        for (int i = 0; i < binarySubList.size(); i++) {
            char binaryExamineValue = binarySubList.get(i);
            if (binaryExamineValue == '1') {
                binaryOneCount++;
            }
        }
        // offets to deal with
        String binaryOneCountString = Integer.toString(binaryOneCount);

        char binaryOneCountCharacter = binaryOneCountString.charAt(0);
        binaryList.add((finishSubListPosition+1), binaryOneCountCharacter);
        startSubListPosition = finishSubListPosition + 2;
        finishSubListPosition = finishSubListPosition + (chromosomeSize+1);

    }
    String lookAt = "";
    for (int i = 0; i < binarySortList.size(); i++) {
        lookAt = binarySortList.get(i);
        for (int j = 0; j < lookAt.length(); j++) {
            char addToList = lookAt.charAt(j);
            binaryList.add(addToList);
        }

    }
    int startRemoval = ((chromosomeSize+1) * (numberOfChromosomes) - 1);
    while(startRemoval >= chromosomeSize) {

        System.out.print(startRemoval);
        binaryList.remove(startRemoval);
        startRemoval = startRemoval - (chromosomeSize + 1);


    }
    // prints list with fitness values removed
    System.out.print(binaryList);

}
}
