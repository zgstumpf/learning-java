package oop;

public class Main {
    public static void main(String[] args) {
        // Instantiate two objects of the Person class
        // joe and bob are reference variables that point to Person objects
        Person joe = new Person();
        Person bob = new Person();
        // Modify a field for a specific instance
        bob.age = 20;
        System.out.println(bob.age); // 20
        System.out.println(joe.age); // 0 (default age)

        // Because species has final modifier, this would error
        // bob.species = "Alien";
    }
}
