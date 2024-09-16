package practicequestions;

public class Problem6 {
    // Q: Write a program that takes an array of integers and finds the largest number in the array.
    static Integer max(int[] arr) {
        if (arr.length == 0){
            return null;
        }

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(max(arr));

        int[] arr1 = {-321, 31, 321, 43, 0, -1, 2, 3, 4, 500, 31, -3};
        System.out.println(max(arr1));
    }
}
