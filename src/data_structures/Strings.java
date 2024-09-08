package data_structures;

import java.util.Arrays;

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

        // Concatenate strings
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1 + str2;
        System.out.println(str3); // "abcdef"

        // contains
        System.out.println(str.contains("bc")); // true

        // replace
        String newStr = str.replace("a", "z");
        System.out.println(newStr); // "zbcdef"

        // trim
        String whitespaceStr = "  so. much. space.  ";
        String trimmedStr = whitespaceStr.trim();
        System.out.println(trimmedStr); // "so. much. space."

        // lowercase, uppercase
        String caps = "ABC";
        String lowered = caps.toLowerCase();
        System.out.println(lowered);
        String uppered = lowered.toUpperCase();
        System.out.println(uppered);

        // split
        String sentence = "This is a sentence with multiple spaces.";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words) + " length: " + words.length);

        // join
        String[] words2 = {"combine", "these", "words"};
        String sentence2 = String.join(" ", words2);
        System.out.println(sentence2);

        // loop
        for (char ch : str.toCharArray()) {
            System.out.println(ch);
        }

        // Empty string
        String empty = "";
        System.out.println(empty.length()); // 0
        System.out.println(empty.equals("")); // true
        System.out.println(empty == null); // false

    }
}