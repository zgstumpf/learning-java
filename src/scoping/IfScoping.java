package scoping;

public class IfScoping {
    public static void main(String[] args) {
        // In this example, we want to print the result after determining if the age is legal.
        // We need to declare the result variable first in an outer scope before the if...else
        // so it can be modified in those inner scopes.
        int age = 20;

        // Declare in outer scope
        String result;

        if (age > 21) {
            // Modify in inner scope
            result = "Legal.";
        } else {
            // Modify in inner scope
            result = "Not legal.";
        }

        // Finally, reference variable in outer scope, which was modified in the inner scopes.
        System.out.println(result);
    }
}
