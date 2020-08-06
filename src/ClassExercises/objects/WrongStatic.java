package ClassExercises.objects;

class Course {
    public static String name;

    public void printName() {
        System.out.println(name);
    }

    Course(String getName) {
        name = getName;
    }
}

public class WrongStatic {
    public static void main(String[] unused) {
        Course cs125 = new Course("CS125");
        cs125.printName();
        Course cs225 = new Course("CS225");
        cs225.printName();
        Course cs128 = new Course("CS128");
        cs125.printName();
        cs225.printName();
        cs128.printName();
    }
}
