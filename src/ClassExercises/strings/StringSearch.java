package ClassExercises.strings;

import java.lang.String;

public class StringSearch {
    public static void main(String[] args) {
        String str = "Hi I am Shruthik";
        String search = "Brother";
        System.out.println(search(str, search));
        search = "Shruthik";
        System.out.println(search(str, search));
    }

    public static boolean search(String s, String searchString) {
        String[] arr = new String[4];
        String str = "";
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                if (i == s.length() - 1) {
                    str += s.charAt(i);
                }
                arr[j] = str;
                j++;
                str = "";
                continue;
            }
            str += s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchString)) {
                return true;
            }
        }
        return false;
    }
}
