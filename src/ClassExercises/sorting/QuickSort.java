package ClassExercises.sorting;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] inputArray, int start, int end) {
        if (end <= start + 1) {
            return 0;
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
        return pivot;
    }

    public static void quickSort(int[] arr, int start, int end){
        int partition = partition(arr, start, end);

        if (partition - 1 > start) {
            quickSort(arr, start, partition - 1);
        }

        if (partition + 1 > end) {
            quickSort(arr, partition + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {8, 5, 7, 3, 4, 11, 6, -1};
        //System.out.println(partition(testArray, 0, testArray.length));
        quickSort(testArray, 0, testArray.length);
        System.out.println(Arrays.toString(testArray));
    }
}
