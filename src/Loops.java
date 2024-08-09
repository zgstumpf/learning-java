public class Loops {
    public static void main(String[] args) {

        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Java supports do/while
        // Do will always be executed at least once.
        // If while condition is true,
        // code in do block will be executed again.
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);


        // For loop
        // for (statement1; statement2; statement3) {}
        // 1. statement1 executed once, before entering body
        // 2. If statement2 is true, body is ran
        // 3. After body is ran, statement3 is ran, go to 2.
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // Foreach loop
        int[] nums = {4, 2, 5, 1};
        for (int n : nums) {
            System.out.println(n);
        }

        // break and continue can be used in for and while loops
        // As expected, break immediately ends the entire loop,
        // and continue skips to the next iteration.
        for (int n: nums) {
            if (n == 2) {
                // Don't print 2
                continue;
            } else if (n == 5) {
                System.out.println("Found 5");
                break;
            } else {
                System.out.println(n);
            }
        }
    }
}
