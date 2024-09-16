package practicequestions;

import java.util.*;

public class Problem9 {
    // Q: Write a program that takes a list of integers and prints each number multiplied by 2 using a for-each loop.
    static void printDouble(List<Integer> nums){
        for (Integer num : nums) {
            System.out.println(num * 2);
        }
    }

    static void printDouble(int[] nums) {
        for (int num : nums) {
            System.out.println(num * 2);
        }
    }

    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        printDouble(list0);

        int[] list1 = {10, 20, 30};
        printDouble(list1);
    }
}
