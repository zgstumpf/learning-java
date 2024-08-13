package oop;

public class Person {
    // Variables declared in the class body are instance variables,
    // meaning any instance of Person will have this variable,
    // and different Person instances may change their value to end up with different values,
    // without affecting other instances.
    // Also called attributes, fields, or properties.
    int legs = 2;
    int age = 0;

    // final: Modifier. Prevents a field from being changed in instances.
    final String species = "Human";
}
