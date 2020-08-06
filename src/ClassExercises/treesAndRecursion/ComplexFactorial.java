package ClassExercises.treesAndRecursion;

public class ComplexFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(-3));
        System.out.println(factorial(-4));
        System.out.println(factorial(0));
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            if (n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        } else {
            if (n == -1) {
                return 1;
            }
            return n * factorial(n + 1);
        }
    }
}
