package practicequestions;

public class Problem3 {
    // Q: Write a program that prints all the elements of an array in reverse order using a for loop.
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3}; // Primitive integers here are autoboxed into Integer objects
        printReverse(arr);
    }
    // To make this work for arrays of any primitive type, you would need to overload the method.
    // printReverse(int[]{...}), printReverse(double[]{...})
    public static void printReverse(Object[] arr){
        for (int i = arr.length - 1; i > -1; i--) {
            System.out.println(arr[i]);
        }
    }
}
