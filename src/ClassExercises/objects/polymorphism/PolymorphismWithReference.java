package ClassExercises.objects.polymorphism;

abstract class _Pet {
    public String getOwner() {
        return "My owner is ...";
    }
    public String toString() {
        return "I am pet";
    }
}
class _Dog extends _Pet {
    public String toString() {
        return "Woof";
    }
}
class Cat extends _Pet {
    public String meow() {
        return "Meow...";
    }
}
public class PolymorphismWithReference {
    public static void main(String[] unused) {
        _Dog chuchu = new _Dog();
        System.out.println(chuchu);
        System.out.println(chuchu.getOwner());
        System.out.println(chuchu);

        _Pet chuchuAsPet = chuchu;
        //System.out.println(chuchuAsPet); // Doesn't work
        System.out.println(chuchuAsPet.getOwner());
        System.out.println(chuchuAsPet);

        Object chuchuAsObject = chuchu;
        //System.out.println(chuchuAsObject); // Doesn't work
        // System.out.println(chuchuAsObject.getOwner()); // Doesn't work
        System.out.println(chuchuAsObject);
    }
}
