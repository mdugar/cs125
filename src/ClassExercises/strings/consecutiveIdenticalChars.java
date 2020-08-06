package ClassExercises.strings;

import java.lang.String;

public class consecutiveIdenticalChars {
    public static void main(String[] args) {
        String input = "Mississippi";
        findPairs(input);
    }

    public static void findPairs(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                System.out.println(input.charAt(i) + " is identical to " + input.charAt(i + 1));
            }
        }
    }
}
