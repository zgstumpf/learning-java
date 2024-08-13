public class ForLoopPreVsPostIncrement {
    public static void main(String[] args) {
        // Standard way for writing for loop
        // Post-increment is used.
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        // 1. i = 0
        // 2. i < 3 -> true
        // 3. print 0
        // 4. i++ -> 0  (return)
        // 5. i = 1     (then increment)
        // 6. i < 3 -> true
        // 7. print 1
        // 8. i++ -> 1  (return)
        // 9. i = 2     (then increment)
        // ....

        // What if pre-increment is used?
        for (int j = 0; j < 2; ++j) {
            System.out.println(j);
        }
        // 1. j = 0
        // 2. j < 2 -> true
        // 3. print 0
        // 4. j = 1     (increment)
        // 5. ++j -> 1  (then return)
        // 6. j < 2 -> true
        // 7. print 1
        // ....

        // Pre or post increment have no difference in the for loop, so use post increment
        // because it is more common.

    }
}
