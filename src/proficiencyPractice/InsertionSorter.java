package proficiencyPractice;

public class InsertionSorter {
    public static void main(String[] args) {
        Comparable[] testArray = new Integer[] {8, 5, 7, 3, 4, 11, 6, -1};
        System.out.println(sort(testArray));
    }

    public static int sort(Comparable[] inputArray) {
        if (inputArray == null || inputArray.length < 2) {
            return 0;
        }

        int numSwaps = 0;
        for (int outerIndex = 1; outerIndex < inputArray.length; outerIndex++) {
            for (int innerIndex = outerIndex; innerIndex > 0; innerIndex--) {
                if (inputArray[innerIndex - 1].compareTo(inputArray[innerIndex]) < 0) {
                    Comparable temp = inputArray[innerIndex - 1];
                    inputArray[innerIndex - 1] = inputArray[innerIndex];
                    inputArray[innerIndex] = temp;
                    numSwaps++;
                } else {
                    break;
                }
            }
        }
        return numSwaps;
    }
}
