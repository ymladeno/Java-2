package CompareJava78;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Compare {

    public double max(List<Double> l) {
        System.out.println("Java7 ===== ");
        double max = 0;
        for (Double d : l) {
            max = d > max ? d : max;
        }
        return max;
    }

    public void printmax(List<Double> l) {
        System.out.println("Java8 one way ===== ");
        System.out.println("Max: " + l.stream().reduce(0.0, Math::max));
        System.out.println("Java8 second way ===== ");
        System.out.println("Max: " + l.stream().mapToDouble(Number::doubleValue).max().getAsDouble());
    }

    public double avarage(List<Double> l) {
        System.out.println("Java7 ===== ");
        double avarage = 0;
        for (Double d : l) {
            avarage = avarage + d;
        }
        avarage = avarage / l.size();
        return avarage;
    }

    public void printAvarage(List<Double> l) {
        System.out.println("Java8 ===== ");
        System.out.println("Avarage: " + l.stream().mapToDouble(Number::doubleValue).average().getAsDouble());
    }

    public static void main(String[] args) {
        Compare cmp = new Compare();
        List<Double> list = Arrays.asList(0.1, 0.2, 0.3, 0.21);
        System.out.println("Max: " + cmp.max(list));
        cmp.printmax(list);
        System.out.println("Avarage: " + cmp.avarage(list));
        cmp.printAvarage(list);

        System.out.println("Java7 ===== ");
        for (int i=1; i<=10; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Java8 ===== ");
        Stream.iterate(1, x -> x+1).limit(10).forEach(System.out::print);
        System.out.println();

        System.out.println("Java8 ===== ");
        IntStream.range(1, 11).forEach(System.out::print);
        System.out.println();

        Dragon[] dragons = {new Dragon("Mike"), new Dragon("Pepe"), new Dragon("Moni")};
        List<String> names = new LinkedList<>();
        
        System.out.println("Java7 ===== ");
        for(Dragon d : dragons) {
            names.add(d.getName());
        }
        String str = String.join(",", names);
        System.out.println(str);

        System.out.println("Java8 ===== ");
        System.out.println(names.stream().collect(Collectors.joining(",")));
    }

    public static class Dragon {
        String name;
        
        Dragon(String name) {
            this.name = name;
        }

        public String getName() { return name; }
    }
}
