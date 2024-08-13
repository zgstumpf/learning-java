package oop.constructor;

public class Person {
    // Remember, instance variables can be declared and not initialized,
    // unlike local variables, which must be declared AND initialized.
    String firstname;
    String lastname;
    String fullname;

    // This is a special method called a constructor
    // It is called when an object of this class is instantiated (such as when "new Person()" is called)
    // It has no return type and MUST have the same name as the class.
    // Think of it as returning an instance of that class.
    public Person(String firstname, String lastname) {
        // "this.firstname" means "For this instance, set its firstname field to the variable firstname."
        this.firstname = firstname;
        this.lastname = lastname;
        this.fullname = firstname + " " + lastname;
    }


}
