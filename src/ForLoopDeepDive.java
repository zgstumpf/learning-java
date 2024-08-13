public class ForLoopDeepDive {
    public static void main(String[] args) {
        // for (initialization; termination; increment) {
        //    ... statement(s) ...
        // }
        // Step 1. Run initialization statement.
        //      IMPORTANT: The variable declared in the initialization statement is scoped
        //      from the start of the opening parantheses of the for statement to the closing
        //      curly bracket at the end of the for loop body. This is different than how scope
        //      usually works (where scope starts at an opening curly bracket and ends at
        //      the closing curly bracket.)
        // Step 2. Run termination statement.
        //      - If it evaluates to true, run code in body and go to Step 3.
        //      - If it evaluates to false, end the loop.
        // Step 3: Run increment statement. Then, go to Step 2.
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Wait a minute - I thought i was already declared in this same scope,
        // since I thought the () after for did not start a new scope, only {} did.
        int i = 5;

        // Under this understanding, this makes sense. You can't declare j in the ()
        // because j has already been declared in the same scope, right?
//        int j = 0;
//        for (int j = 0; j < 5; j++) {
//            System.out.println(j);
//        }
        // Yes, it makes sense here.

        // From Java Docs (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html):
        //      [The for loop] declares a variable within the initialization expression.
        //      The scope of this variable extends from its declaration to the end of the block
        //      governed by the for statement.
        // This changes my understanding since I thought only curly brackets {} defined a new scope.

        // Yes, the for loop is a special case for variable scope.
        // The scope of a for loop starts at the opening parantheses and ends at the closing bracket.
//        for (int k = 0; k < 5; k++) {
//            int k; // Error
//        }


        // The termination statement runs before the body, even for the very first iteration.
        System.out.println("z for loop:");
        for (int z = 0; z < 0; z++) {
            System.out.println(z); // Nothing is printed because z is initialized to 0,
            // and the termination statement is evaluated to false because z < 0 -> 0 < 0 -> false
        }

    }
}
