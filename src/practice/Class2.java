package practice;

class TwoMainMethods {
    public static void main(String[] args) {
        System.out.println("Main1");
    }
}

class Class2 {
    public static void main(String[] args) {
        System.out.println("Main2");
    }
}

// Output: Main1

// When you run Class2.java, the filename determines which class gets compiled and executed by default.
// The current behavior is due to the fact that you're running TwoMainMethods either directly or indirectly through your
// IDE or build tool, which defaults to the first class with a main method in the file.