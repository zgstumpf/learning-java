package oop.modifiers.package1;

// public: any class can use this class
public class Class1 {
    // Just specifying the whole class as public isn't enough - to use a field,
    // you must make that public too.
     public static String text = "I am Class1.";

     public static void main(String[] args) {
         System.out.println(PackageOnly.text);
     }
}
