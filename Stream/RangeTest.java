package Stream;

import java.util.stream.IntStream;

public class RangeTest {
    public static void main(String[] args) {
        IntStream.range(1, 11).forEach(System.out::println);
    }
}
