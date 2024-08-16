package data_structures;

public class Strings {
    public static void main(String[] args) {
        String str = "abcdef";

        // Length
        // Be careful - .length() is used for String, .length is used for Array.
        assert str.length() == 6;

        // Slicing
        assert str.substring(0, 1).equals("a");
        assert str.substring(1, 4).equals("bcd");
        assert str.substring(str.length() - 1).equals("f");
    }
}