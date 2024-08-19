// CodeNotes for Java Intermediate and Advanced Language Features - Gregory Bill - 2021

package codenotesforjava;

class CanConstructorBePrivate {
    public static void main(String[] args) {
        SpanishMan man0 = new SpanishMan();
        man0.speak();
    }
}

class PrivateConstructor {
    // CodeNotes said constructor can't be private - it was wrong.
    private PrivateConstructor() {

    }
}

class Person {
    Person() {
        System.out.println("Creating Person object..");

    }

    void speak() {
        System.out.println("Hi");
    }
}

class SpanishMan extends Person {
    SpanishMan() {
        System.out.println("Creating SpanishMan object...");
    }

    void speak() {
        System.out.println("Hola");
    }
}
