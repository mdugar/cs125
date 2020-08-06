package ClassExercises.objects.objectReferences;

class Pet {
    public String toString() {
        return "Object is a pet";
    }
}
class ReferencesAndMethodOverriding {
    public static void what(Object o) {
        System.out.println("Reference is an object");
        System.out.println(o);
    }
    public static void what(Pet p) {
        System.out.println("Reference is a pet");
        System.out.println(p);
    }
    public static void main(String[] unused) {
        Pet pet = new Pet();
        what(pet);
        Object object = pet;
        what(object);
    }
}
