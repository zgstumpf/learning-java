package practicequestions;

import java.util.*;

public class Problem15 {
    // Q: Description: Write a program that takes an unsorted array of integers and returns the length of the
    // longest consecutive elements sequence. The sequence can be in any order, but the numbers must be
    // consecutive. Your solution should run in O(n) time complexity and use O(n) extra space.
//    Requirements:
//
//    Use a HashSet to solve the problem.
//    No need to sort the array.
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        
    }
}
