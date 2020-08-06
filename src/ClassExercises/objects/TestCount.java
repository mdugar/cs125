package ClassExercises.objects;

class Count {
    public static int count = 0;

    public void printCount() {
        System.out.println(count);
    }
}

public class TestCount {
    public static void main(String[] args) {
        Count cs125 = new Count();
        Count cs225 = new Count();
        Count.count++;
        cs125.printCount();
        cs225.printCount();
    }
}
