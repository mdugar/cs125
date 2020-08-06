package ClassExercises.exceptions;

import java.util.Random;

public class SimpleTryCatch {

    public static void main(String[] args) {
        // Handle both errors thrown by the function above
        try {
            throwRandomError();
            System.out.println("Done"); // never run because an exception was caught
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Uh-oh, faced an error: " + e);
        } // can also split this into separate catch statements
    }

    public static int throwRandomError() {
        Random random = new Random();
        if (random.nextBoolean()) {
            Object it = null;
            return it.hashCode();
        } else {
            int[] array = new int[] {};
            return array[4];
        }
    }
}
