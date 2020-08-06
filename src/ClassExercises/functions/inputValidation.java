package ClassExercises.functions;

public class inputValidation {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {1, 2, 5, 6}));
        System.out.println(sum(null));
    }

    public static int sum(int[] numbers) {
        if (numbers == null) {
            return -1;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
