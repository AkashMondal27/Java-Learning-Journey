class Father{
    Father(){
        System.out.println("This the main Base class");
    }
}

class Son1 extends Father{
    Son1(){
  System.out.println(" This the son1 ");
    }
}
class Son2 extends Father{
    Son2(){
  System.out.println(" This the son2 ");
    }
}
class Son3 extends Father{
    Son3(){
  System.out.println(" This the son3 ");
    }
}
class Son4 extends Father{
    Son4(){
  System.out.println(" This the son4 ");
    }
}

public class example {
  public static void main(String[] args) {
      Son1 RamChandra =new Son1();
      Son2 Lakshmana = new Son2();
      Son3 Bharat = new Son3();
      Son4 Satrughana = new Son4();

      // make a print to avoide the warning message of not use the object
      System.out.println(RamChandra);
      System.out.println(Lakshmana);
      System.out.println(Bharat);
      System.out.println(Satrughana);
  }   

}


/*.............................NOTES........................................
3. Hierarchical Inheritance
In hierarchical inheritance, more than one subclass is inherited from a single base class.
 i.e. more than one derived class is created from a single base class.
  
                         Father  (One Base class)
                           |
       ----------------------------------------
       |            |           |             |
      Son1        Son2        Son3          Son4  
*/