package ClassExercises.objects.interfaces;

interface Added {
    int add(int first, int second);
}
interface Subtract {
    int subtract(int first, int second);
}
class Mathy implements Added, Subtract {
    public int add(int first, int second) {
        return first + second;
    }
    public int subtract(int first, int second) {
        return first - second;
    }
}
public class MultipleInterfaces {
    public static void main(String[] unused) {
        Mathy adder = new Mathy();
        System.out.println(adder.subtract(10, 20));
        System.out.println(adder.add(10, 20));
    }
}
