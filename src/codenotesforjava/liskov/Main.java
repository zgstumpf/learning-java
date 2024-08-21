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

        // Why does this work?
        Car convertible1 = new Convertible(); // Subclass used in place of its superclass.
        // But not this?
        // Convertible convertible2  = new Car(); // Error - superclass used in place of its subclass.

        // convertible1.activateRoof() // Error - Because convertible1 is actually type Car, it
        // does not have the activateRoof method.
    }
}
