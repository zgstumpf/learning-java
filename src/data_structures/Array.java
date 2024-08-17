package data_structures;
import java.util.Arrays;

// Arrays are fixed length

class Array {
    public static void main(String[] args) {
        // Declare array
        int[] nums = {1, 2, 3};

        // Declare array with default values
        int[] defaultNums = new int[3];

        // Print array
        System.out.println(Arrays.toString(nums)); // "[1, 2, 3]"

        // Length - note it is .length, NOT .length()
        System.out.println(nums.length); // 3

        // Get first element
        System.out.println(nums[0]); // 1
        // Get last element
        System.out.println(nums[nums.length - 1]); // 3

        // Modify element
        System.out.println(Arrays.toString(defaultNums));
        defaultNums[0] = 10;
        System.out.println("\t|\n\tv");
        System.out.println(Arrays.toString(defaultNums));
    }
}
