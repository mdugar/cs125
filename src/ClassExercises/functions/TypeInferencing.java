package ClassExercises.functions;

public class TypeInferencing {
    public static void main(String[] args) {
        /* An example of type inferencing in java
        * Using var keyword instead if explicitly declaring type of the variable
        * */
        var sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
