package ClassExercises.objects.interfaces;

abstract class Add_Class {
    public abstract int add(int first, int second);
}

class Adder_Class extends Add_Class {
    public int add(int first, int second) {
        return first + second;
    }
}

interface Add {
    int add(int first, int second);
}

class Adder implements Add {
    public int add(int first, int second) {
        return first + second;
    }
    public int multiply(int first, int second) {
        return first * second;
    }
}
public class BasicInterfaces {
    public static void main(String[] unused) {
        Add add = new Adder(); // casted an object to the interface it implemented
        System.out.println(add.add(10, 12)); // multiply method doesn't work here due to wrong reference type
        Adder adder = new Adder();
        System.out.println(adder.add(10, 12));
        System.out.println(adder.multiply(10, 12));

        // Abstract Classes
        Add_Class c = new Adder_Class();
        System.out.println(c.add(5, 10));
    }
}
