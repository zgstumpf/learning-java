package codenotesforjava.liskov;

// Liskov Substitution Principle:
// A subclass can be used in place of its superclass.
// (But not necessarily the other way around.)

class Main {
    public static void main(String[] args) {
        // All cars have drive() method.
        Car car0 = new Car();
        car0.drive();

        // Convertible is a subclass of Car,
        // so it has drive() method, but it also has a unique activateRoof() method.
        Convertible convertible0 = new Convertible();
        convertible0.drive();
        convertible0.activateRoof();

        // This section includes polymorphism concepts.
        // --------------------------------------------
        // Why does this work?
        Car convertible1 = new Convertible();
        // Subclass used in place of its superclass.
        // Create Convertible object, store reference in Car variable.
        // This only works because Convertible is a type of Car.
        // Because convertible1 has been declared as a Car, it only has access to Car fields/methods.


        // But not this?
        // Convertible convertible2  = new Car(); // Error - superclass used in place of its subclass.
        // Doesn't work because Convertible may have additional fields/methods not defined in Car class.

        // convertible1.activateRoof() // Error - Because convertible1 is actually type Car, it
        // does not have the activateRoof method.
    }
}
