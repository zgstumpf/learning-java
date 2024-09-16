package practicequestions;

public class Problem4 {
    // Q: Create a class called Car with attributes for make, model, and year. Create a constructor to initialize
    // these values. Then, create two Car objects and print their details.
    public static void main(String[] args) {
        Car car0 = new Car("Honda", "Coupe", 2012);
        Car car1 = new Car("Toyota", "Van", 2019);

        System.out.println(car0.toString());
        System.out.println(car1.toString());
    }


}

class Car {
    String make;
    String model;
    int year;

    Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format("Car(make=\"%s\", model=\"%s\", year=%d)", this.make, this.model, this.year);
    }
}

