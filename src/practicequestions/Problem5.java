package practicequestions;

public class Problem5 {
    // Q: Create an interface Animal with a method makeSound(). Then, create two classes Dog and Cat that implement
    // this interface. In the main method, create objects of both classes and call the makeSound() method for each.
    public static void main(String[] args) {
        // Implement to interface.
        // This can be flexible sometimes, but you can't access any fields/methods not in the interface.
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        // -------------------------
        // Error
        // System.out.println(cat.hasWhiskers);

        // No Error - because we declared cat1 as Cat.
        Cat cat1 = new Cat();
        System.out.println(cat1.hasWhiskers);
    }
}

interface Animal {
    // Remember, in interfaces, all methods are implicitly public.
    void makeSound();
}

class Dog implements Animal {
    // Must be equal or greater access than method in interface.
    // So it must be public, since that's the greatest access level.
    public void makeSound(){
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    boolean hasWhiskers = true;

    public void makeSound(){
        System.out.println("Meow");
    }
}