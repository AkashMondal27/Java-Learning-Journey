

public class Example {
   public static void main(String[] args) {
    TV remote=new TVRemote();
    remote.turnOF();
    remote.turnON();
    
   } 
}


abstract class  TV{
    abstract  void turnON();
    abstract  void turnOF();
}


class TVRemote extends TV{
    @Override
    void turnON(){
        System.out.println("TV  is turned on ");
    }

    @Override
    void turnOF(){
        System.out.println(" TV is turn OFF");
    }
}

/*...................Abstraction in Java.................
Abstraction in Java is the process of hiding internal implementation 
details and showing only essential functionality to the user. 
It focuses on what an object does rather than how it does it.
*/