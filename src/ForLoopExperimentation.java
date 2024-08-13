public class ForLoopExperimentation {
    public static void main(String[] args) {
        int i = 0;
        // Start a for loop with an already-initialized variable by omitting the initialization statement
        for (; i < 5; i ++) {
            System.out.println(i);
        }


        // Why are there errors on i and j saying they are already defined in scope?
        // j has already been declared in an outer scope. The brackets {} after the for loop
        // create an inner scope. j is declared in this inner scope, but j already exists in an
        // outer scope, so it errors.
        // i has already been declared. A new scope does not start until there are curly brackets.
        // The parentheses after the for loop do not declare a new scope.
//        int j = 1; // declare j
//        for(int i = 0; i < 5; i++) {
//            int j = 5;
//        }


    }
}
