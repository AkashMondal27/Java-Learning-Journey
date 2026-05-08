public  class Example1{
    public static void main(String[] args) {
         Animal a;
        a = new Dog();
        a.sound();  

        a = new Cat();
        a.sound(); 

        a = new Cow();
        a.sound();  
    }
}


// create a parents class 
class Animal{
    void sound(){
        System.out.println("Every animals make a sound ");
    }
}

// cleate some derive class
class Dog extends  Animal{
  @SuppressWarnings("override")
  void sound(){
    System.out.println("dog barks");
  }
}
class Cat extends Animal {
    @SuppressWarnings("override")
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class
class Cow extends Animal {
    @SuppressWarnings("override")
    void sound() {
        System.out.println("Cow moos");
    }
}

/*.......................NOTES ....................................... 

Inheritance is a core OOP concept in Java that allows one class to acquire 
the fields and methods of another class using the extends keyword. 
It represents an “is-a” relationship between classes.

The class being inherited is called the superclass/Parent class/ Base class 
and the inheriting class is the subclass/Child class/ Derived class.

A subclass can use existing features of the superclass and also add its own.
Inheritance promotes code reusability and reduces redundancy. */