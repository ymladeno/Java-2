package ForEach;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(-1, -2, 5, 7, 10);
        int sum = l.stream().reduce(0, (i1, i2) -> (i1+i2));

        System.out.println("Sum is " + sum);
    }
}
