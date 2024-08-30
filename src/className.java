public class className {
    public static void main(String[] args) {
        int x = 1;
        // x.getClass(); // Error because x is primitive and has no methods

        String y = "abc";
        System.out.println(y.getClass()); // java.lang.String

        Car car = new Car();
        System.out.println(car.getClass()); // Car

        System.out.println(car instanceof Car); // true
    }

}

class Car {

}
