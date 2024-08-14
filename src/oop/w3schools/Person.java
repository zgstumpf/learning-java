package oop.w3schools;

// This code is from https://www.w3schools.com/java/java_encapsulation.asp
public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
        // W3 schools used this.name, but just name would work as well
        // name = newName
        // This works because since name wasn't declared, it refers to the instance variable.
        // This wouldn't have worked if the parameter name was name and not newName,
        // because then name would refer to the parameter, not the instance variable.
    }

    public static void main(String[] args) {
        Person person0 = new Person();
        person0.setName("Bob");
        System.out.println(person0.getName());
    }
}