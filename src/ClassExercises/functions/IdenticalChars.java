package ClassExercises.functions;

public class IdenticalChars {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'b', 'c', 'd', 'c', 'c'};
        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == characters[i + 1]) {
                System.out.println(characters[i] + " is the same as " + characters[i + 1] + "");
            }
        }
    }
}