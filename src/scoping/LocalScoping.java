package scoping;

public class LocalScoping {
    public static void main(String[] args) {
        // Once you declare a local variable, you can't declare a variable
        // of the same name in an inner scope.
        int i = 0;

        // Exact same scope - error
        // int i = 0;

        // Brackets make a new body, or a new scope.
        {
            // This is an inner scope.
            // int i = 1;
            // Error because i was already defined in outer scope.
        }

        // i here is still in the exact same scope
        // An inner scope doesn't start with (), it starts with {}
//        for (int i = 0; i < 5; i++) {
//
//        }

    }
}
