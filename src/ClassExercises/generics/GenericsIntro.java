package ClassExercises.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsIntro {
    public static void main(String[] unused) {
        List<String> list = new ArrayList();
        list.add("string");
        String s = list.get(0);
        System.out.print(list.get(0));
        //list.add(10); --> won't work since only accepts Strings
    }
}
