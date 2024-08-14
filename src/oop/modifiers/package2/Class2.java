package oop.modifiers.package2;

// Must be full package path
// Must specify which class to import (use * to import all classes in the package)
import oop.modifiers.package1.*;

public class Class2 {
    static String text = "I am Class2";

    public static void main(String[] args){
        // Access Class1 from Class2, which are both in separate packages.
        System.out.println(Class1.text);
    }
}
