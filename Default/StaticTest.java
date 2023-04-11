package Default;

import java.util.Arrays;
import java.util.stream.Stream;

public class StaticTest {
    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        String[] strs = {"foo", "bar", "static", "method", "java"};

        Stream<String> stream = Arrays.stream(strs, 1, 3);
        stream.forEach(System.out::println);
    }
}
