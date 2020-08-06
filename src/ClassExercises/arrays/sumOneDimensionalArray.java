package ClassExercises.arrays;

public class sumOneDimensionalArray {
    public static void main(String[] args) {
        System.out.println(arraySum(new int[] {1, 2, 5}));
    }

    static int arraySum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
