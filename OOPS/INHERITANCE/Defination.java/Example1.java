public class Example1 {
     public static void main(String[] args) {
         Animal a ;
         a= new Dog();
         a.sound();
     }
}


// create Parents class 
class Animal {
    void sound(){
        System.out.println("Every animal makes sound ");
    }
}

// create a Derived classes

class Dog extends Animal{
    void sound(){
        System.out.println("Doges barks");
    }
}

class Cat extends  Animal{
    void sound(){
        System.out.println(" cat meows");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}