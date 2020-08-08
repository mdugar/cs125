package ClassExercises.exceptions;

import java.util.Random;

public class usingFinally {

    static void couldError() {
        Random random = new Random();
        if (random.nextBoolean()) {
            Object it = null;
            it.hashCode();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("start");
            couldError();
            System.out.println("done");
        } catch (Exception e) {
            System.out.println("catch");
        } finally { // works because we have some form of handling the Exception. Without catch, finally fails.
            System.out.println("finally");
        }
    }
}
