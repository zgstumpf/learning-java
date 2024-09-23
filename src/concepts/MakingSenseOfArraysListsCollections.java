package concepts;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MakingSenseOfArraysListsCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Larry", "Moe", "Curly");
        names.set(0,"Bob");
        // Can't use .add() because Arrays.asList returns fixed size list??
        System.out.println(names);
        System.out.println(names.getClass()); // java.util.Arrays$ArrayList

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
    }
}
