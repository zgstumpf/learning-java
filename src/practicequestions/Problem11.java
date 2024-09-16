package practicequestions;

public class Problem11 {
    // Q: Write a program that takes an array of integers representing ages. Use a for-each loop and
    //  if statements to categorize each age into one of the following groups and print the results:
    // "Child" (0-12), "Teen" (13-19), "Adult" (20-64), and "Senior" (65+).
    //
    // Requirements:
    //
    // Create an int[] array with sample ages.
    // Use if statements inside a for-each loop to categorize and print number of ages for each age group.
    public static void main(String[] args) {
        int[] ages = {0, 2, 12, 14, 15, 51, 66, 69, 70, 72};
        int numChild = 0;
        int numTeen = 0;
        int numAdult = 0;
        int numSenior = 0;
        for (int age : ages) {
            if (age <= 12){
                numChild++;
            }
            else if (age <= 19) {
                numTeen++;
            }
            else if (age <= 64) {
                numAdult++;
            }
            else {
                numSenior++;
            }
        }
        // Note usage of printf instead of println(String.format(..))
        System.out.printf("Child=%d, Teen=%d, Adult=%d, Senior=%d%n", numChild, numTeen, numAdult, numSenior);
    }
}
