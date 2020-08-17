package ClassExercises.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testArray = new int[] {8, 5, 7, 7, 3, 4, 11, 6, -1}; // Stable Sort
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void bubbleSort(int[] inputArray) {
        if (inputArray == null || inputArray.length < 2) {
            return;
        }

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (inputArray[j] > inputArray[j+1]) {
                    int temp = inputArray[j+1];
                    inputArray[j+1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
    }
}
