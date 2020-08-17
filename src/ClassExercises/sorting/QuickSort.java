package ClassExercises.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void partition(int[] inputArray, int start, int end) {
        if (end <= start + 1) {
            return;
        }
        int pivot = start;
        int pivotVal = inputArray[start];
        for (int i = start + 1; i < end; i++) {
            if (inputArray[i] < pivotVal) {
                pivot++;
                int temp = inputArray[pivot];
                inputArray[pivot] = inputArray[i];
                inputArray[i] = temp;
            }
        }
        inputArray[start] = inputArray[pivot];
        inputArray[pivot] = pivotVal;
    }

    public static void quickSort(int[] arr, int start, int end){
        partition(arr, start, end);

        quickSort(arr, start, end - 1);
        quickSort(arr, start + 1, end);
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {8, 5, 7, 3, 4, 11, 6, -1}; // Unstable Sort
        quickSort(testArray, 0, testArray.length);
        System.out.println(Arrays.toString(testArray));
    }
}
