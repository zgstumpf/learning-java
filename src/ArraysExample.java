// For many array functions we need to import this
import java.util.Arrays;

// Arrays in Java have a fixed length and datatype.
// But, arrays are mutable since you can change the values of elements.

public class ArraysExample {
    public static void main(String[] args) {
        // Declare and initialize array
        // datatype[] name = {value, value};
        int[] nums = {1, 2, 3};
        // Get element at index
        System.out.println(nums[0]);
        // Set element at index
        nums[0] = 10;
        // Get length of array
        System.out.println(nums.length);
        // Print array - need to import java.util.Arrays;
        System.out.println(Arrays.toString(nums));
        // Sort array
        Arrays.sort(nums);

        // Get sum of array
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }
        System.out.println(sum);

        // Declare and initialize empty array.
        // Array is populated with default values based on its datatype.
        int[] nums2 = new int[4]; // [0, 0, 0, 0]
        System.out.println(Arrays.toString(nums2));

        // Can also declare and initialize arrays like this
        String[] brands = new String[] {"Honda", "Ford"};
        // Why not do this?
        String[] brands2 = {"Honda", "Ford"};
        // You could, but in some contexts the new keyword is required.
    }

    // Example of when new keyword is required
    public static String[] getColors() {
        return new String[] {"red", "blue"};
    }
    //... You could also do this, but it is wordier.
    public static String[] getColors2() {
        String[] colors = {"red", "blue"};
        return colors;
    }

}
