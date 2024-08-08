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
        System.out.println(5*5);
    }
}