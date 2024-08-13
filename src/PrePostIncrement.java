public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 0;

        // Post-increment: return current value of i, then increment by 1.
        // increment AFTER evaluation - makes sense because ++ is AFTER the variable.
        int a = i++;
        System.out.println(a); // 0
        System.out.println(i); // 1

        // Reset value of i
        i = 0;

        // Pre-increment: Increment i by 1, then return i.
        // increment BEFORE evaluation - makes sense because ++ is BEFORE the variable.
        int b = ++i;
        System.out.println(b); // 1
        System.out.println(i); // 1

        // Reset value of i
        i = 0;

        // ?
        int c = i++ + ++i;
        // Step 1:
        // Find out what first part, i++, does
        // Increment after evaluate
        //  - evaluate i++ as 0
        //      - int c = 0 + ++i
        //  - increment i
        //      - i = 1
        // Step 2:
        // Find out what second part, ++i, does
        // Increment before evaluate
        //  - increment i
        //      - i = 2
        //  - evaluate
        //      - int c = 0 + 2
        // Step 3:
        // Find result
        // - int c = 3
        // - i = 2
        System.out.println(c); // 2 ??? I was wrong.
        System.out.println(i); // 2     I was right about this.

        // Wow, I was wrong because I literally just did basic math wrong in the comments.
        // - int c = 0 + 2
        // - int c = 3
        // Why did I do this? Idk, At least I understood pre and post increment.
    }
}
