package ForEach;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Hello", 123);
        m.put("Me", 180);
        m.put("You", 200);
        
        for(Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
    }
}
