package data_structures;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        // Declare and initialize hashmap
        HashMap<String, Integer> map = new HashMap<>();

        // Add keys/values
        map.put("a", 1);
        map.put("b", 5);

        // Get value based on key
        System.out.println(map.get("b")); // 5

        // Print hashmap
        System.out.println(map); // {a=1, b=5}

        // Is key in hashmap
        System.out.println(map.containsKey("b")); // true
        // Is value in hashmap
        map.containsValue(6); // true

        // Modify value of key - 2 examples
        map.put("b", map.get("b") + 1);
        map.put("b", 8);
        System.out.println(map);

        // Get length (number of keys)
        System.out.println(map.size()); // 2

        // Remove key-value pair
        map.remove("a");
        System.out.println(map);

        // Iterate through entries
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Iterate through keys
        for (String key : map.keySet()) {
            // ...
        }

        // Iterate through values
        for (int value : map.values()) {
            // ...
        }
    }
}
