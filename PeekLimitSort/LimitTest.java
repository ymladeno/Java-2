package PeekLimitSort;

import java.util.Random;

public class LimitTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        rnd.ints().limit(10).sorted().forEach(System.out::println);
    }
}
