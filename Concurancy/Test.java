package Concurancy;

import java.util.concurrent.ForkJoinPool;

public class Test {
    static ForkJoinPool joinPool = new ForkJoinPool();
    public static final int LENGTH = 2000;
    public static void main(String[] args) {
        int[] numbers = new int[LENGTH];
        
        for (int i = 0; i < LENGTH; i++) {
            numbers[i] = i * 2;
        }

        int sum = joinPool.invoke(new NumberDividerTask(numbers));
        System.out.println(sum);
    }
};
