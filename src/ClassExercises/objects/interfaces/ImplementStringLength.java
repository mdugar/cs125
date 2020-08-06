package ClassExercises.objects.interfaces;

interface Comparable {
    int compareTo(Object other);
}
class StringLength {
    private String string;

    StringLength(String s) {
        string = s;
    }
    public int compareTo(Object other) {
        if (other == null || !(other instanceof StringLength)) {
            return -1;
        }

        StringLength o = (StringLength) other;
        if (o.string.length() < string.length()) {
            return -1;
        } else if (o.string.length() > string.length()) {
            return 1;
        }
        return 0;
    }
}

public class ImplementStringLength {
    public static void main(String[] args) {
        StringLength s1 = new StringLength("test");
        StringLength s2 = new StringLength("me");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1));
        System.out.println(s2.compareTo(s1));
    }
}
