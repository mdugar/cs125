package ClassExercises.objects.objectReferences;

/* Uses Person class from objectReferencesExperimentation.java */
public class ArraysStoreObjectReferences {
    public static void main(String[] unused) {
        Person[] people = new Person[4];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(18 + i);
        }
        Person[] samePeople = new Person[4];
        for (int i = 0; i < people.length; i++) {
            samePeople[i] = people[i];
        }
        for (int i = 0; i < people.length; i++) {
            people[i].age += 10;
        }
        for (int i = 0; i < samePeople.length; i++) {
            System.out.println(samePeople[i].age);
        }
    }
}
