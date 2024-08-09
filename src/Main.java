// Java

// A programming language owned by Oracle.
// Used by >3 billion machines for all purposes.
// Open source, object-oriented, similar to C++ and C#.

// Java Development Kit (JDK): environment with everything needed to develop Java
// applications, including javac, the Java compiler.
// |    contains...
// v
// Java Runtime Environment (JRE): libraries and classes
// |    contains...
// v
// Java Virtual Machine (JVM): executes Java program

//IntelliJ IDEA: integrated development environment for developing Java applications
// .iml file: file used by IntelliJ IDEA to store module-level settings.
//            Can be regenerated, should not be tracked by source control.
// .idea/ directory: used by IntelliJ IDEA to store project-level settings,
//                   such as breakpoints and code styles. Can be regenerated,
//                   should not be tracked by source control, unless all team
//                   members are using IntelliJ.
// out/ directory: contains compiled .class files. Should not be tracked by source control.
// src/ directory: source directory, stores source code (.java) files

// See if Java is installed on your machine
// $ java -version

// Create Java Program
// A java file ends in extension .java
// A java file must start with a class
// The name of the file (before the extension) and the class name must be the same.

// Run Java Program
// The javac compiler compiles .java files to .class files, which contain Java bytecode.
// Bytecode is low-level code that the Java Virtual Machine can execute.
//
// Compile .java file:
// $ javac Main.java
// This command creates a file named Main.class in the same directory.
// Java thinks this file represents a class named Main.
//
// Now, run the class. The java command expects a Java class, not a filename,
// which is why java Main.class won’t work. Basically, java Main tells the JVM to
// look for a file named Main.class and execute it.
//$ java Main
//
// On later Java versions, you may be able to run java Main.java without compiling,
// since the JDK may do it behind the scenes. In this case, a .class file may
// never be created in the current working directory.



// This is a comment.

/* This...
* is...
* a multi-line comment. */

// A .java file must contain a class.
// The name of the file (before the extension) and the
// class name must be the same.
// Every line of code must be inside a class.
public class Main {
    // public: access modifier. Any class or package can use this class.
    // class: keyword to declare a class
    // Main: name of the class, should be CamelCase.
    // Curly brackets {} mark the start and end, or the body, of classes.

    // Java programs intended to be run by the Java Virtual Machine
    // must contain a main() method. main() is the entry point of
    // the program, meaning the code inside will be executed when
    // the program runs.
    public static void main(String[] args) {
        // public: access modifier. Any class can use this method.
        //         main() MUST be public.
        // static: This method belongs to the class, not an instance
        //         of the class. main() MUST be static.
        // void: Return type. void means the method does not return anything.
        // main: method name. Remember JVM looks for a method named main.
        // (String[] args): Parameters. This method takes a parameter named
        //                  args, which is an array of String objects, or
        //                  for convenience, called Strings.
        // Just like with classes, curly brackets {} mark the body of the method.

        // This is a statement. All statements must end in a semicolon.
        System.out.println("Hello World");
        // System: A class named System.
        //      Bonus Info:
        //      The System class is part of the Java Standard Library, which is
        //      included in the JRE. Java programs automatically have access to
        //      any classes in the Java Standard Library.
        // out: A field in the System class.
        //      Bonus Info:
        //      The out field is an instance of another class, which contains
        //      the println() method. This might look like:
        //        public class System {
        //            public static final PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
        //        }
        // println: A method within the out field.
        // Like many other languages, a period is used to navigate the
        // hierarchy or classes, fields, methods, and properties.


        // Print output to terminal with newline at end
        System.out.println("Hello World");

        // Print output to terminal without newline
        System.out.print("*");
        System.out.print("*");
        // Result: **

        // Print other data types
        System.out.println(5);

        // Print results of code to be evaluated
        System.out.println(5*5); // Result: 25
        // Like many programming languages, comments can be placed in-line
        // after a statement.


        // Variables

        // Variables must be assigned a data type.
        // Data types can be in 1 of 2 groups:
        //  1. Primitive (no additional methods, cannot be null, start with lowercase letter)
        //      - byte: 1 byte, integers -128 to 127
        //      - short: 2 bytes, -32,768 to 32,767
        //      - int: 4 bytes, -2,147,483,648 to 2,147,483,647
        //      - long: 8 bytes: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //           MUST end in L.
        //           * Need a bigger integer? Use java.math.BigInteger.
        //      - float: 4 bytes, decimals up to 7 places. MUST end in f.
        //      - double: 8 bytes, decimals up to 15 places
        //           * Never use floats or doubles when exact precision
        //             is required (ex: currency calculations).
        //             Use java.math.BigDecimal.
        //      - boolean: (size may vary), true or false
        //      - char: 2 bytes, a single character, such as 'A'
        //      * For numbers, int and double are most commonly used.
        //      ** Integer numbers without suffix are automatically type int.
        //         Decimal numbers without suffix are automatically type double.
        //  2. Non-primitive (reference types, point to objects, can have methods, can be null, start with uppercase letter)
        //      - String
        //      - Array
        //      - Class

        // Syntax to declare a variable:
        // dataType variableName = value;
        //    * variableName is also called an identifier
        String a = "abc"; // String must be surrounded with double quotes
        int b = 10;
        boolean c = true;
        float d = 7.99f; // float must end in f, or Java thinks it is double.
        long baz = 9223372036854775807L; // long must end in L
        char e = 'e'; // char must be surrounded with single quotes


        // Non-primitive or reference types can be null, meaning
        // it does not point to any object.
        String f = null;

        // Now, g points to a String object with value "something".
        String g = "something";

        // Bonus Info
        String g2 = "something";
        // To save space, Java makes g and g2 point to the same
        // String object, since they have the same value anyway.

        // final keyword makes variable constant, or unchangeable.
        final int MY_NUM = 15; // all caps with underscores
        // h = 20; -> error

        // Declare multiple variables of same data type on 1 line
        int x = 1, y = 2, z = 3;

        // Assign same value to multiple variables of same
        // datatype at once
        int i, j, k;
        i = j = k = 0;

        // Declare variable now, initialize it with value later
        int foo;
        foo = 10;
        // Variable must be eventually initialized with a value, or
        // there will be an error.


        // Casting or converting types

        // Widening casting: done automatically
        int amount = 20;
        float amount2 = amount * 1.1f;

        // Narrowing casting: you have to do manually
        double number = 10.512;
        int numberAsInt = (int) number;


        // Math operators
        // + Add
        // - Subtract
        // * Multiply
        // / Divide
        // % Mod (remainder)
        // ++ Increment by 1
        // -- Decrement by 1
        // For exponents, use Math.pow(2, 3) // 2^3 -> 8
        // For square root, use Math.sqrt(64) -> 8

        // For ints, / does floor division.
        System.out.println(5 / 2); // 2.5 -> floor -> 2

        // For doubles, / does normal division with decimals.
        System.out.println(5.0 / 2.0); // 2.5

        // Increment usage
        int boo = 6;
        boo++; // same as boo += 1
        System.out.println(boo); // 7

        // Math operator and assign at same time
        boo += 3;
        System.out.println(boo); // 10

        Math.max(1, 3); // 3
        Math.min(1, 3); // 1
        Math.abs(-100); // 100


        // Boolean comparison

        // == equal to
        // != not equal to
        // >  greater than
        // <  less than
        // >= greater than or equal to
        // <= less than or equal to

        // && AND
        // || OR
        // !  NOT


        // String operations
        String text = "Hello";
        text.length(); // 5
        text.toLowerCase(); // returns "hello" - does not change value
        text.trim(); // returns String without leading, trailing spaces
        char result = text.charAt(0); // return char at index 0 -> 'H'
        char result2 = text.charAt(text.length() - 1); // return char at last index -> 'o'
        String result3 = text.substring(1, 4); // start, stop -> "ell"
        String result4 = text.substring(1); // leave out stop index to go from start to end of String -> "ello"
        String result5 = "abc" + "def"; // "abcdef" // concat

        // Insert variables into strings
        int var1 = 200;
        int var2 = 400;
        System.out.println("Numbers are " + var1 + " and " + var2); // Numbers are 200 and 400
        // Order matters. First + adds 2 ints, second + adds result int and String, producing String
        System.out.println(var1 + var2 + " is 600"); // 600 is 600
        // Some special characters need to be escaped with \
        System.out.println("Double quote in string: \" ");
        System.out.println("Backslash in string: \\ ");
        System.out.println("Line1\nLine2"); // \n is newline


        // If statements behave as expected.
        // Conditions are in (), clause bodies are in {}.
        // Keywords: if, else if, else
        if (1 > 10) {
            // ...
        } else if (5 > 2) {
            // ...
        } else {
            // ...
        }

        // Ternary if statement
        // (condition) ? return this if true : return this if false
        int grade = 80;
        String message = (grade > 60) ? "You passed." : "You failed.";

        // Switch case
        // Behaves as expected
        // Note cases start with a :
        // If you don't end a case with break, the code will continue checking the next cases.
        String day = "Sunday";
        switch (day) {
            case "Saturday":
                System.out.println("It's Saturday");
                break;
            case "Sunday":
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("It's a weekday");
        }
        
    }
}