package ClassExercises.functions;

public class findMax {
    public static void main(String[] args) {
        int[] values = {4, 5, 1, -8, 9, 10};
        int maximum = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maximum) {
                maximum = values[i];
            }
        }
        System.out.println(maximum);
    }
}