

public class Basics {

    public static void main(String[] args) {
         Pen p1 = new Pen(); // creating an object of class Pen
           p1.setColor("Blue");
           System.err.println("Color of pen is " + p1.color);

          p1.setTip(5);   
            System.out.println("Tip of pen is " + p1.tip);
          p1.color = "Black";  // we can also change the value of properties directly without using method
            System.out.println("Color of pen is " + p1.color);  
    }
    
}


// class is a blueprint of an object . it is a user defined data type which has properties and behaviors .
class Pen{   
    String color;  // properties
    int tip;

    void setColor(String newColor){
        color = newColor;  // behavior
    }

    void setTip(int newTip){
        tip = newTip;  // behavior
    }
}



//  class Student {
//     String name ;
//     int age ;
//     float percentage ;


//      void calculatePercentage( int phy , int chem , int math ){
//         percentage = (phy + chem + math ) / 3 ;
//      }


//  }