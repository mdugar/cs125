package ClassExercises.objects;

class Thing {
    private String name;

    Thing(String setName) {
        name = setName;
    }
    /** Overriding the Object.toString() method */
    public String toString() {
        return name;
    }
}

public class MethodOverriding {
    public static void main(String[] unused) {
        Thing thingOne = new Thing("thingOne");

        // Uses toString() automatically
        System.out.println(thingOne);
    }
}
