package oop;

// With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define
// (as default methods) are public.

// If interface is public, it can be used in any package.
// If no modifier, it can only be used in its package.

// Interfaces can extend multiple parent interfaces
public interface InterfaceExample {
    // Constant
    int three = 3;

    // Abstract method - has no curly braces
    void abstractMethod(int i);

    // Default method - has implementation
    default void defaultMethod(){
        System.out.println("Default");
    }

    // Static method - Can call this method on interface
    static void staticMethod(){
        System.out.println("Static");
    };


}

class Class implements InterfaceExample {
    // Class implementing an interface must declare every abstract method in the interface, and give it a body.
    // Access modifier must be same or greater access
    public void abstractMethod(int i) {
        System.out.println(i + i);
    }
}

class Program {
    public static void main(String[] args) {
        Class class0 = new Class();
        class0.abstractMethod(5);
        class0.defaultMethod();
        InterfaceExample.staticMethod();
    }
}


