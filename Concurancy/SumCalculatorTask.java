package Concurancy;

import java.util.concurrent.RecursiveTask;

public class SumCalculatorTask extends RecursiveTask<Integer> {

    public SumCalculatorTask(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        return sum;
    };

    private int[] numbers;
};

