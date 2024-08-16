package data_structures;

public class Strings {
    public static void main(String[] args) {
        String str = "abcdef";

        // Length
        // Be careful - .length() is used for String, .length is used for Array.
        System.out.println(str.length() == 6); // true

        // Slicing
        // -------
        // Strings are 0-indexed, second argument of substring is STOP index.
        System.out.println(str.substring(0, 1).equals("a")); // true
        System.out.println(str.substring(1, 4).equals("bcd")); // true
        // If STOP index argument is left out, it defaults to end of String.
        // Can't use -1 to get last index like in Python
        System.out.println(str.substring(str.length() - 1).equals("f")); // true
        System.out.println(str.substring(1).equals("bcdef")); // true

        // Remember to always use .equals(), since == compares memory locations
        System.out.println(str.substring(0, 1) == "a"); // false
        // This isn't true because str.substring() is NOT a String literal, while "a" is.
        // See IdentityVsEquality.java for more info
    }
}