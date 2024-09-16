package practicequestions;

import java.util.*;

public class Problem1 {
    // Q: Write a program that takes an integer input from the user and determines if the
    // number is positive, negative, or zero.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int integer = input.nextInt();
        if (integer > 0) {
            System.out.println("positive");
        }
        else if (integer == 0) {
            System.out.println("zero");
        }
        else {
            System.out.println("negative");
        }
    }
}
