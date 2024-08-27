package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// Unlike an Array, an ArrayList can change its size.

public class ArrayLists {
    public static void main(String[] args) {
        // <> used for generics
        // Means we are declaring an ArrayList of Integers
        // Must use wrapper class for each primitive type
        ArrayList<Integer> nums = new ArrayList<>();

        // Add elements
        nums.add(1);
        nums.add(2);

        // Print
        System.out.println(nums);

        // Length
        System.out.println(nums.size()); // 2

        // Declare and initialize with elements
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3, 4, 5));
        System.out.println(nums2); // [3, 4, 5]

        // Get first element
        System.out.println(nums2.get(0)); // 3
        // Get last element
        System.out.println(nums2.get(nums2.size() - 1)); // 5

        // Modify element
        nums2.set(1, 0);
        System.out.println(nums2); // [3, 0, 5]

        // Loop
        for (int i: nums2) {
            System.out.println(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            System.out.println(nums2.get(i));
        }

        // Slice
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 5, 6, 7));
        ArrayList<Integer> nums4 = new ArrayList<>(nums3.subList(0, 3));
        System.out.println(nums4); // [4, 5, 1]

        // Is element in ArrayList
        System.out.println(nums3.contains(6)); // true

        // Sort
        Collections.sort(nums3);
        System.out.println(nums3);

        // Max, min
        System.out.println(Collections.max(nums3));
        System.out.println(Collections.min(nums3));
    }

}
