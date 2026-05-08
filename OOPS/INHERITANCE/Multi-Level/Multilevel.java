class GrandFather{
    GrandFather(){
        System.out.println("This is grandfather , 1st parent class ");
    }
}

class Father extends GrandFather{
    Father(){
        System.out.println("This a Father , 2nd parent classa as well as a chils od 1st parent class ");
    }
}

class  Son  extends Father{
    Son(){
        System.out.println("this is son and it is the last chils ");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Son obj= new Son();
        System.out.println(obj);
    }
}


/* ............................Notes..........................
2. Multilevel Inheritance
In Multilevel Inheritance, a derived class will be inheriting a base class 
and as well as the derived class also acts as the base class for other classes.

     Grand Father   (1st parent class)
          |
        Father  ( 2nd parent classa as well as a chils od 1st parent class)
        |
      Son   (it is the last chils) 


*/