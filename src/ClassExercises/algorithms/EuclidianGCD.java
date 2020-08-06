package ClassExercises.algorithms;

class EuclidianGCD_Implementation {
    private static boolean isDivisor(int first, int second, int n) {
        return ((first % n == 0) && (second % n == 0));
    }

    /* Generic Euclidian Algorithm Implementation */
    public static int gcdOne(int first, int second) {
        if(first == second)
            return first;

        if(first % second == 0) {
            return second;
        }
        return gcdOne(second, first % second);
    }

    /* Formal Euclidian Algorithm Implementation */
    public static int gcdTwo(int first, int second) {
        if(first == second)
            return first;
        else if(first > second)
            return gcdTwo(first - second, second);
        else if(first < second)
            return gcdTwo(first, second - first);
        return gcdTwo(second, second - first);
    }
}
public class EuclidianGCD {
    public static void main(String[] unused) {
        System.out.println("Generic Euclidian Algorithm Implementation:");
        System.out.println(EuclidianGCD_Implementation.gcdOne(10, 8));
        System.out.println(EuclidianGCD_Implementation.gcdOne(70, 70));
        System.out.println(EuclidianGCD_Implementation.gcdOne(100, 50));
        System.out.println(EuclidianGCD_Implementation.gcdOne(94677, 65270));

        char c = 'a';
        char d = (char) (c + 13);
        System.out.println(d);

        System.out.println("Specific/Formal Euclidian Algorithm Implementation:");
        System.out.println(EuclidianGCD_Implementation.gcdTwo(10, 8));
        System.out.println(EuclidianGCD_Implementation.gcdTwo(8, 10));
        System.out.println(EuclidianGCD_Implementation.gcdTwo(100, 50));
        System.out.println(EuclidianGCD_Implementation.gcdTwo(50, 100));
    }
}