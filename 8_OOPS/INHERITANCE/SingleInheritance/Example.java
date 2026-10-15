public class Example {
   public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        @SuppressWarnings("unused")
        Car obj = new Car();
    }
}

//Super class
class Vehicle {
    Vehicle() {  // this is constructor so the name is sane is class name 
        System.out.println("This is a Vehicle");
    }
}

// Subclass 
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}


/* ..............NOTES ....................
1. Single Inheritance
In single inheritance, a sub-class is derived from only one super class.
 It inherits the properties and behavior of a single-parent class.
  Sometimes, it is also known as simple inheritance. 

         Vehicle (Parent class)
          |
        Car (Child class)
           
  */