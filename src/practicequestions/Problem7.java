package practicequestions;

import java.util.*;

public class Problem7 {
    // Q: Create a program that uses a HashMap to store the names and ages of 5 people. Then, write logic to print
    // out all the names of people who are 18 or older.
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Bob", 23);
        people.put("Alice", 5);
        people.put("Sam", 41);
        people.put("Zach", 12);
        people.put("Bobby", 18);

        for (Map.Entry entry : people.entrySet()) {
            // Need to use narrow casting because we did not use generics to specify types in entry
            if ((int) entry.getValue() >= 18) {
                System.out.println(entry.getKey());
            }
        }

        // The better way
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() >= 18) {
                System.out.println(entry.getKey());
            }
        }
    }
}
