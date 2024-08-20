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

        // Loop
        // ----
        // For each / Enhanced for
        for (int num : nums) {
            System.out.println(num);
        }
        // Regular for
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Slice
        int[] nums2 = {4, 1, 6, 7, 1, 5, 7, 8, 3, 1};
        // Params: original array, from index, to index (exclusive)
        int[] nums3 = Arrays.copyOfRange(nums2, 1, 4);
        System.out.println(Arrays.toString(nums3)); // [1, 6, 7]
        int[] copyNums2 = Arrays.copyOfRange(nums2, 0, nums2.length);
        System.out.println("nums2 copy: " + Arrays.toString(copyNums2));

        // Is element in array
        // -------------------
        // Note: for some reason, there is no built-in java method for this.
        for (int num : nums2) {
            if (num == 8) { // == will only work for primitives
                System.out.println("Found 8");
            }
        }

        String[] strings = {"A", "B", "C"};
        for (String str : strings) {
            if (str.equals("B")) { // use .equals for strings
                System.out.println("Found B");
            }
        }

        // Sort
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));

        // Find max/min
        // ------------
        // You have to implement this yourself too.
        int max = Integer.MIN_VALUE;
        for (int num : nums2) {
            max = Math.max(max, num);
        }
        System.out.println("Max of nums2 is " + max);

        int min = Integer.MAX_VALUE;
        for (int num : nums2) {
            min = Math.min(min, num);
        }
        System.out.println("Min of nums2 is " + min);

        // Exercises
        // ---------
        // Sort reverse
        int[] nums4 = {3, 5, 1, 5, 6, 7, 4};
        Arrays.sort(nums4);
        System.out.println(Arrays.toString(nums4));
        int[] res = new int[nums4.length];
        int j = nums4.length - 1;
        for (int num: nums4) {
            res[j] = num;
            j--;
        }
        System.out.println(Arrays.toString(res));

        // Experiment with array referencing
        int[] numsTest = {1, 1};
        int[] numsTest2 = {1};
        // == works as expected for primitives - values are compared.
        System.out.println(numsTest[0] == numsTest[1]); // true
        System.out.println(numsTest2[0] == numsTest[0]); // true

        // For objects, including strings, == checks if memory locations are identical.
        // However, for strings, the string pool is used, so all string literals point to the
        // same string object in memory.
        String[] letters = {"A", "A"};
        String[] letters2 = {"A"};
        System.out.println(letters[0] == letters[1]); // true
        System.out.println(letters2[0] == letters[0]); // true
    }
}
