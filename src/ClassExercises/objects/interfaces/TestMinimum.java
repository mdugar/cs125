package ClassExercises.objects.interfaces;

class Minimum {
    public static Comparable min(Comparable[] values) {
        if (values == null || values.length == 0) {
            return values[0];
        } else if (values.length == 1) {
            return values[0];
        }

        Comparable min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(min) < 0) {
                min = values[i];
            }
        }
        return min;
    }
}

public class TestMinimum {
    public static void main(String[] unused) {
        //System.out.println(Minimum.min(new String[] {"one", "two", "five"}));
        //System.out.println(Minimum.min(new Integer[] {1, 2, 5}));
    }
}
