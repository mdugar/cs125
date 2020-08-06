package ClassExercises.objects;


class Pet {
    protected String type;
    Pet(String setType) {
        type = setType;
    }
}
class Dog extends Pet {
    private String breed;
    Dog(String setBreed) {
        super("Dog"); // super reference to parent constructor
        breed = setBreed;
    }
}
public class BasicInheritance {
    public static void main(String[] unused) {
        Dog chuchu = new Dog("Mutt");
        System.out.println(chuchu.type);
    }
}