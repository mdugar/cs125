package ClassExercises.functions;

public class ArrayAverage {
    public static void main(String[] args) {
        double[] toAverage = {0.1, 6.7, 8.9, 10.4, 11.2, 0.9};
        double average = 0.0;
        for (double d : toAverage) {
            average += d;
        }
        average /= toAverage.length;
        System.out.println(average);
    }
}