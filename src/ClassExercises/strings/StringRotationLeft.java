package ClassExercises.strings;

public class StringRotationLeft {
    public static void main(String[] args) {
        System.out.println(rotateLeft("102", 2));
        System.out.println(rotateLeft("San Francisco", 4));
        System.out.println(rotateLeft(null, 1));
        System.out.println(rotateLeft("Shruthik", 0));
    }

    static String rotateLeft(String s, int n) {
        if (s == null)
            return null;

        if (n == 0 || n < 1)
            return s;

        char[] c = s.toCharArray();
        char[] outputArray = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int outputIndex = (i - n) % s.length();
            if (outputIndex < 0)
                outputIndex += s.length();
            outputArray[outputIndex] = c[i];
        }
        return new String(outputArray);
    }
}
