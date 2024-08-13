// How nested classes work in Java

// Outer class
public class OOPErrorExample {

    // Inner class
    public class Person {
        String species = "Human";
    }

    // Give all instances of OOPErrorExample a field named person1.
    Person person1;

    public static void main(String[] args) {
        // Person person1 = new Person();
        // Why does this error?
        // Because class Person is a nested class inside class OOPErrorExample and not static,
        // Person requires an instance of OOPErrorExample be initialized first.

        // Standard way of instantiating a new instance of a class
        OOPErrorExample example = new OOPErrorExample();

        // Before setting example.person1, the OOPErrorExample (example's class) must have a field named
        // person1.
        // example.new is required to call the constructor of the inner class
        example.person1 = example.new Person();
    }
}
