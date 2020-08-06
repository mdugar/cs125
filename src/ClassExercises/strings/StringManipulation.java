package ClassExercises.strings;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "408 914 5770";
        System.out.println(manipulate(str));
    }

    public static String manipulate(String s) {
        String[] c = s.split(" ");
        return "(" + c[0] + ")" + c[1] + "-" + c[2];
    }
}
