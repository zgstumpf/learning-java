package practicequestions;

import java.util.*;

public class Problem14 {
//    Description: Write a program that takes an array of integers and identifies all the duplicate values in the array.
//    Print each duplicate value and its count.
//
//            Requirements:
//
//    Initialize an int[] array with sample values.
//    Print all numbers that have a count greater than 1.
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 1, 3, 3, 3, 4, 4, 5, 6};
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> count : counts.entrySet()) {
            if (count.getValue() > 1) {
                System.out.println(count);
            }
        }

        System.out.println("----------");
        // Attempt to do this with O(1) space
        nums = new int[]{0, 1, 1};
        Arrays.sort(nums); // time complexity is O(n log n) because sorting is required
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1]){
                count++;
            }
            else {
                if (count > 1) {
                    System.out.println(nums[i - 1] + ": " + count);
                }
                count = 1;
            }
        }
        // Check last element
        if (count > 1){
            System.out.println(nums[nums.length - 1] + ": " + count);
        }
        // This code looks like trash.

        System.out.println(1 + 1); // 2
        System.out.println(1 + "1"); // 11
        System.out.println("1" + 1); // 11
        System.out.println(1 + 1 + "1"); // 21
        System.out.println("" + 1 + 1); // 11
    }
}
