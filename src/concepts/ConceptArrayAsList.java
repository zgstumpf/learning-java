package concepts;

import java.util.Arrays; // Class
import java.util.List; // Interface
import java.util.ArrayList; // Class

public class ConceptArrayAsList {
    public static void main(String[] args){

        // int[] arr = {1, 2, 3};
        // List<Integer> list = Arrays.asList(arr);
        // Result - Error: incompatible types equality constraints: java.lang.Integer lower bounds: int[]
        // This happens because Arrays.asList expects varargs of the generic type in the declaration,
        // but arr is an int[], so Arrays.asList is trying to create a list of int arrays, not a list of Integers.

        // Convert int[] to List
        int[] arr = {1, 2, 3};
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        System.out.println(list);


    }
}
