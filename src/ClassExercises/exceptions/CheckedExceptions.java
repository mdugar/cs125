package ClassExercises.exceptions;

import java.net.URI;
import java.net.URISyntaxException;

public class CheckedExceptions {

    public static URI createURI(final String input) {
        try {
            return new URI(input);
        } catch (URISyntaxException e) { // I must use a try-catch block here
            System.out.println(input + " is not a valid URI");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(createURI("https://cs125.cs.illinois.edu/"));
        System.out.println(createURI("ht:"));
    }
}
