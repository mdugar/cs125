package ClassExercises.objects.objectReferences;

class Person {
    public String name;
    public int age = 0;

    Person(int setAge) {
        age = setAge;
    }

    Person(String setName) {
        name = setName;
    }
    public String toString() {
        return name;
    }
}

public class ObjectReferencesExperimentation {
    public static void main(String[] unused) {
        int first = 0;
        int second = first;
        second = 8;
        System.out.println(first + " " + second);

        // Same reference so now, both me and you point in reference to the same object
        Person me = new Person("Geoff");
        Person you = me;
        you.name = "Student";
        System.out.println(me + " " + you);
    }
}

