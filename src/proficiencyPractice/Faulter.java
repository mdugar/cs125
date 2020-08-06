package proficiencyPractice;

public class Faulter {
    private String str;

    Faulter(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        this.str = s;
        System.out.println(str);
        fault();
    }

    public Exception fault() {
        if(str.equals("NullPointer")) {
            return new NullPointerException();
        } else if (str.equals("ArrayIndexOutOfBounds")) {
            return new ArrayIndexOutOfBoundsException();
        } else if (str.equals("ClassCast")) {
            return new ClassCastException();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
