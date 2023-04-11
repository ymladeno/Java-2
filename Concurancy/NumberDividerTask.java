package Concurancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class NumberDividerTask extends RecursiveTask<Integer> {
    public NumberDividerTask(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    protected Integer compute() {
        ArrayList<RecursiveTask<Integer>> tasks = new ArrayList<>();

        if (numbers.length > 20) {
            NumberDividerTask task1 = new NumberDividerTask(Arrays.copyOfRange(numbers, 0, numbers.length/2));
            NumberDividerTask task2 = new NumberDividerTask(Arrays.copyOfRange(numbers, numbers.length/2, numbers.length));
            tasks.add(task1);
            tasks.add(task2);
            task1.fork();
            task2.fork();
        } else {
            SumCalculatorTask task = new SumCalculatorTask(numbers);
            tasks.add(task);
            task.fork();
        }

        int sum = 0;
        for (RecursiveTask<Integer> task : tasks) {
            sum += task.join();
        }
        return sum;
    };

    private int[] numbers;
};
