package oop.modifiers.package3;

class Class1 {
    // Order of modifiers doesn't matter.
    final static int x = 2;
    static final int y = 3;

    // Any class that extends Class1 can't override this function.
    final void myFunction() {

    }
}
