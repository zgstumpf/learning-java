public class ReturnNonPrimitive {
    // Question: If String and Array are both non-primitive, or object, types, why
    // does Array need new keyword to be initialized?
    // Answer: It just comes down to the rules about how Strings and Arrays can be initialized.

    public static String getString() {
        // Compiler is okay with String literals
        return "ABC";

        // return new String "ABC"; will error
    }

    public static String[] getStringArray() {
        // In return statements, you must use return new type[] {...}
        return new String[] {"A", "B", "C"};

        // return {"A", "B", "C"}; will error
    }

    public static void main(String[] args) {
        // Including new type[] before the Array value is optional
        String[] arr = new String[] {"A", "B", "C"};
        String[] arr2 = {"A", "B", "C"};

        // Square brackets can follow variable name, but this is less common and hard to read.
        String arr3[] = {"A", "B", "C"};

        // Initialize array of fixed length = 3, with all elements getting default values.
        int[] arr4 = new int[3]; // {0, 0, 0}

        // Remember - Including new type[] before the Array value is optional
        int[] arr5 = new int[] {1, 2, 3};

        // You can't do this to specify length of array - length is inferred based on the values given.
        // new type[length] is reserved for initializing array of default values.
        // int[] arr6 = new int[3] {1, 2, 3}; Error

        // You can't initialize strings like this.
        // String str1 = new String "ABC"; Error

        // However, you can initialize strings like this, which makes sense since they are Objects.
        // But, you have no reason to do this.
        String str2 = new String("ABC");

        // The best way to initialize a String.
        String str3 = "ABC";

    }
}
