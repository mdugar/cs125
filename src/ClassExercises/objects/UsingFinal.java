package ClassExercises.objects;

public class UsingFinal {
    // static needed to refer to variable without a particular instance
    public static final int HOURS_PER_NIGHT = 8;

    public static void main(String[] unused) {
        //HOURS_PER_NIGHT = 8; ---> This WIL NOT work
        System.out.println(HOURS_PER_NIGHT);
    }
}
