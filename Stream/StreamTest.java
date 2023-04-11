package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        System.out.println("Method 1");
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4);
        s1.forEach(System.out::println);

        System.out.println("Method 2");
        String[] strs = {"1", "2", "3", "4"};
        Stream<String> s2 = Arrays.stream(strs);
        s2.forEach(System.out::println);
    }
}
