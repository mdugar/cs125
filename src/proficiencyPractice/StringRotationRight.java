package proficiencyPractice;

public class StringRotationRight {
    public static void main(String[] args) {
        System.out.println(rotateRight("102", 1));
        System.out.println(rotateRight("San Francisco", 1));
        System.out.println(rotateRight("Shruthik", 0));
    }

    static String rotateRight(String s, int n) {
        if (s == null)
            return null;

        if (n == 0 || n < 1)
            return s;

        char[] c = s.toCharArray();
        char[] outputArray = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int outputIndex = (i + n) % s.length();
            if (outputIndex < 0)
                outputIndex += s.length();
            outputArray[outputIndex] = c[i];
        }
        return new String(outputArray);
    }
}
