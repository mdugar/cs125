package ClassExercises.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] testArray = new int[] {8, 5, 7, 3, 4, 11, 6, -1};
        System.out.println(Arrays.toString(insertionSort(testArray)));
    }

    public static int[] insertionSort(int[] inputArray) {
        if (inputArray == null || inputArray.length < 2) {
            return inputArray;
        }

        for (int outerIndex = 1; outerIndex < inputArray.length; outerIndex++) {
            for (int innerIndex = outerIndex; innerIndex > 0; innerIndex--) {
                if (inputArray[innerIndex - 1] > inputArray[innerIndex]) {
                    int temp = inputArray[innerIndex - 1];
                    inputArray[innerIndex - 1] = inputArray[innerIndex];
                    inputArray[innerIndex] = temp;
                } else {
                    break;
                }
            }
        }
        return inputArray;
    }
}
