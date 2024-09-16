package practicequestions;

import java.util.*;

public class Problem10 {
    // Q: Write a program that takes an integer input representing a grade (0-100). Use nested if statements to print
    // the corresponding letter grade: A, B, C, D, or F.
    // A: 90-100
    // B: 80-89
    // C: 70-79
    // D: 60-69
    // F: 0-59

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer 0-100:");
        int grade;
        try {
            grade = input.nextInt();
        }
        catch (InputMismatchException e) {
            throw new Exception("Grade must be an integer");
        }


        if (grade < 0 || grade > 100) {
            throw new Exception("Grade must be between 0-100");
        }

        // Problem requirements did mention "nested if"...
        if (grade > 59) {
            if (grade > 69){
                if (grade > 79) {
                    if (grade > 89) {
                        System.out.println("A");
                    }
                    else {
                        System.out.println("B");
                    }
                }
                else {
                    System.out.println("C");
                }
            }
            else {
                System.out.println("D");
            }
        }
        else {
            System.out.println("F");
        }
    }
}
