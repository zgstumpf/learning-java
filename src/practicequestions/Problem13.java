package practicequestions;

import java.util.*;

public class Problem13 {
    // Q: Description: Write a program that takes an ArrayList<Integer> of numbers and calculates the sum of
    // all odd numbers in the list using a for-each loop.
    //
    //Requirements:
    //
    //Create an ArrayList<Integer> with sample numbers.
    //Use a for-each loop to iterate through the list.
    //Use an if statement to check if a number is odd and accumulate the sum.
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int sum = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
