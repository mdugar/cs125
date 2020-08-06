package ClassExercises.algorithms;

class GCD_Implementation {
    private static boolean isDivisor(int first, int second, int n) {
        return ((first % n == 0) && (second % n == 0));
    }

    public static int gcd(int first, int second) {
        int smallest = first;
        if (second < first) {
            smallest = second;
        }
        for (int i = smallest; i > 1; i--) {
            if (isDivisor(first, second, i)) {
                return i;
            }
        }
        return 1;
    }
}
public class gcd {
    public static void main(String[] unused) {
        System.out.println(GCD_Implementation.gcd(10, 8));
        System.out.println(GCD_Implementation.gcd(100, 50));
        System.out.println(GCD_Implementation.gcd(94677, 65270));
    }
}
