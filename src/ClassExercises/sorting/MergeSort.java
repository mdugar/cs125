package ClassExercises.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] first, int[] second) {
        if (first == null && second == null) {
            return null;
        } else if (first == null || first.length == 0) {
            return second;
        } else if (second == null || second.length == 0) {
            return first;
        }
        int[] merged = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int mergedIndex = 0; mergedIndex < merged.length; mergedIndex++) {
            if (firstIndex == first.length) {
                merged[mergedIndex] = second[secondIndex];
                secondIndex++;
            } else if (secondIndex == second.length) {
                merged[mergedIndex] = first[firstIndex];
                firstIndex++;
            } else if (first[firstIndex] < second[secondIndex]) {
                merged[mergedIndex] = first[firstIndex];
                firstIndex++;
            } else {
                merged[mergedIndex] = second[secondIndex];
                secondIndex++;
            }
        }
        return merged;
    }

    public static int[] mergesort(int[] inputArray) {
        if (inputArray.length < 2) {
            return inputArray;
        }
        int[] left = Arrays.copyOfRange(inputArray, 0, inputArray.length / 2);
        int[] right = Arrays.copyOfRange(inputArray, inputArray.length / 2, inputArray.length);
        return merge(mergesort(left), mergesort(right));
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {8, 5, 7, 3, 4, 11, 6, -1};
        System.out.println(Arrays.toString(mergesort(testArray)));
    }

}
