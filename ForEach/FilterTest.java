package ForEach;

import java.util.ArrayList;
import java.util.List;

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class FilterTest {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("apple", 2.3));
        items.add(new Item("carrot", 1.6));
        items.add(new Item("garlic", 7.2));

        items.stream().filter(x -> x.price > 1.8).map(x -> x.price).forEach(System.out::println);
    }
}
