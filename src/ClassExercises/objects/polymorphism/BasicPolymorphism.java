package ClassExercises.objects.polymorphism;

class Human {
    public void printMe() {
        System.out.println("I'm a human");
    }
}
class German extends Human {
    public void printMe() {
        System.out.println("I'm a human of German descent");
    }
}
public class BasicPolymorphism {
    public static void main(String[] unused) {
        Human jack = new German();
        Human jill = new Human();
        jack.printMe();
        jill.printMe();
    }
}
