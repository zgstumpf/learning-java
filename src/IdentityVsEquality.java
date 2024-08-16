public class IdentityVsEquality {
    public static void main(String[] args) {
        // == checks if memory locations are equal
        // .equals() checks if values are equal

        // Comparing primitives is straightforward.
        // Primitives don't have an .equals() method.
        int a = 5;
        int b = 5;
        // a and b point to same memory location to save memory.
        // a -> 5 <- b
        System.out.println(a == b); // true

        // Comparing Objects such as Strings is more complicated.
        // If a String is initialized using a literal, it is added to the string pool, which is
        // used to save memory.
        String d = "abc"; // add "abc" to string pool. d -> "abc"
        String e = "abc"; // since "abc" already exists in string pool, reuse it. d -> "abc" <- e

        // Due to string pooling, d and e point to same memory location
        System.out.println(d == e); // true

        // However, if a String is initialized using new String(), a new String object
        // is created in memory.
        String f = new String("abc");
        // d -> "abc" <- e
        // f -> "abc"

        // d and f do not point to same memory location.
        System.out.println(d == f); // false

        // Of course, the value of d and f is the same.
        System.out.println(d.equals(f)); // true

        // Conclusion
        // To compare primitives, use ==
        // To compare Strings, use .equals()
    }
}
