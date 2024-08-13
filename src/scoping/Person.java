package scoping;

// Class
public class Person {
    // Instance variable - declared in a class but outside a method or block
    int age = 0;

    public void myMethod() {
        // Local variable - declared in a method
        int age = 10;
        // How is this possible? Isn't int age already declared in an outer scope?
        // Yes, but in Java there is a concept called shadowing.
        // Shadowing - when a local variable has the same name as an instance variable,
        // the local variable temporarily overrides the instance variable.
        System.out.println(age); // 10

        // To access the instance variable, use this.variable
        System.out.println(this.age); // 0
    }

    // Method
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.myMethod();

    }
}
