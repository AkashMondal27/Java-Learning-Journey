

public class example {
     public static void main(String[] args) {
            pen pen1 = new pen();  
            pen1.setColor("blue");  
            pen1.setTip(5);        
            System.out.println("Color of pen is " + pen1.getColor());  
            System.out.println("Tip of pen is " + pen1.getTip());      
     }
}


class pen{
    String color ;
    int tip;

    // setter method to set the value of color and tip
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }

    // getter method to get the value of color and tip
    String getColor(){
        return  this.color;
    }

    int getTip(){
        return this.tip;
    }
}

/* "this"  is use for current object . it is used to refer the current object in which it is used .
 it is used to access the properties and methods of the current object . it is also used to 
 differentiate between local variable and instance variable when they have same name .
 */