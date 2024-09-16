package practicequestions;

import java.util.*;

public class Problem12 {
    // Q: Description: Write a program that takes a 2D array (matrix) of integers and prints its transpose.
    // The transpose of a matrix is obtained by swapping rows with columns.
    //
    //Requirements:
    //
    //Initialize a 2D array with sample values.
    //Print the original matrix and its transpose.
    //Ensure to handle matrices of different sizes.

    // 1 1 1          1 2 3
    // 2 2 2    -->   1 2 3
    // 3 3 3          1 2 3
    public static void main(String[] args) {
        int[][] arr = {{4, 1, 3},
                       {2, 6, 7}};

        // Find number of rows and number of columns of input array
        // number rows = arr.length
        // number columns = arr[0].length
        final int ROWS = arr.length;
        final int COLS = arr[0].length;

        // Give resultArr the vice versa of that
        int[][] resultArr = new int[COLS][ROWS];

        //
        for (int i = 0; i < COLS; i++)
            for (int j = 0; j < ROWS; j++)
                resultArr[i][j] = arr[j][i];

        // Note use of deepToString for a nested array
        System.out.println(Arrays.deepToString(resultArr));
    }

}
