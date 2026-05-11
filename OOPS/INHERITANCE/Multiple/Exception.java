// Create  Interface 

interface Father {
      //default means this method already has a body and implementing classes can use it directly

    default  void display(){
        System.out.println("I am  a Parent 1");
    }
}


interface Mother {
    default void display(){
        System.out.println("I am a parent 2");
    }
}


// Class  Son is implementing both interfaces A and B
// this is called multiple inheritance using interfaces

 class  Son implements Father, Mother {
 /*because both interfaces contain same default method ,Java gets confused
 so we MUST override display() method */


 @Override
 public  void  display(){

    /*calling display() method of interface Father 
         Father.super means:
         "use the default method of interface A" */
    Father.super.display();
    Mother.super.display();

    System.out.println("i am the son , child");

   }

 }


public class Exception {
    public static void main(String[] args) {
        Son OBJ = new Son();
        OBJ.display();   // calling display() method using object
        
    }
    
}
