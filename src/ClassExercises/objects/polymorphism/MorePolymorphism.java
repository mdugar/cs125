package ClassExercises.objects.polymorphism;

class Animal { }

class Pet extends Animal {
    public String name;

    public String toString() {
        return "My pet is named " + name;
    }
}

class Dog extends Pet { }

class OldDog extends Dog { }

class SweetOldDog extends OldDog {
    private double sweetness = 0.0;

    public String toString() {
        return name + " is a Sweet Old Dog with sweetness level " + sweetness;
    }

    SweetOldDog(String setName, double setSweetness) {
        name = setName;
        sweetness = setSweetness;
    }
}

public class MorePolymorphism {
    public static void main(String[] unused) {
        SweetOldDog chuchu = new SweetOldDog("Chuchu", 100.0);

        // Using Object.toString()
        System.out.println(chuchu);
    }
}