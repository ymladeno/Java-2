package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public void printStringsJava7(List<String> list) {
        System.out.println("-- Java 7 --");
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            };
        });

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void printStringsJava8(List<String> list) {
        System.out.println("-- Java 8 --");

        Collections.sort(list, (s1,s2) -> s1.length() - s2.length());
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("CHelloagain", "bworldnow", "aorever");
        SortTest test = new SortTest();
        test.printStringsJava7(new ArrayList<String>(list));
        test.printStringsJava8(new ArrayList<String>(list));
    }
}
