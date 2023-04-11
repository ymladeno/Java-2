package PeekLimitSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekTest {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 100, 200, 3, 300);
        List<Integer> l2 = l1.stream()
                            .peek(System.out::println)
                            .collect(Collectors.toList());

        System.out.println(l2);
    }
}
