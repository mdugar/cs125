package ClassExercises.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArray = new int[] {8, 5, 7, 7, 3, 4, 11, 6, -1}; // Stable Sort
        selectionSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void selectionSort(int[] inputArray) {
        if (inputArray == null || inputArray.length < 2) {
            return;
        }

        for (int i = 0; i < inputArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = inputArray[minIndex];
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = temp;
        }
    }
}
