package ClassExercises.strings;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse1("Shruthik Reddy Musukula"));
        System.out.println(reverse2("Kendall Hester"));
        System.out.println(reverse3("Yusuf Halabi"));
    }

    public static String reverse1(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static String reverse2(String input) {
        char[] forward = input.toCharArray();
        String reversed = "";
        for (int i = forward.length - 1; i >= 0; i--) {
            reversed += forward[i];
        }
        return reversed;
    }

    public static String reverse3(String input) {
        char[] forward = input.toCharArray();
        String reverse = "";
        for (int i = forward.length - 1; i >= 0; i--) {
            int reversedIndex = forward.length - i - 1;
            reverse += forward[i];
        }
        return reverse;
    }
}
