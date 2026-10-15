
public class Example {
    public static void main(String[] args) {

        Vehicle car = new Car();

        car.start();
        car.stop();
    }
}

// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract void start();
    abstract void stop();
}

// Child class
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting with key");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping using brakes");
    }
}