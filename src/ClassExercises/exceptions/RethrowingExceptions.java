package ClassExercises.exceptions;

public class RethrowingExceptions {
    static void foo1() {
        Object it = null;
        int hash = it.hashCode();
    }
    static void foo2() {
        try {
            foo1();
        } catch (NullPointerException e) {
            System.out.println("Here");
            e.printStackTrace();
            throw(e);
        }
    }
    static void foo3() {
        foo2();
    }
    static void foo4() {
        try {
            foo3();
        } catch (Exception e) {
            System.out.println("Bottom");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        foo4();
    }
}
