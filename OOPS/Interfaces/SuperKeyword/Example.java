



public class Example {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.color);
    }
}

class Animal {

    String color = "Black";

    public Animal() {
        System.out.println("animal constructor is called");
    }
     
}  

class Dog extends Animal {

    
   
    Dog(){
        System.out.println(" dog is clalled : " + super.color);
    }
}