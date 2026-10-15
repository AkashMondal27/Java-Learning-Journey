//Create  INterfaace 
interface FamilyProperty{
   default  void  properties(){
        System.out.println("Get all the Family propertys ");
    }
}

//Grandfather class

class GrandFather{

   void  House() {
        System.out.println("Grandfather have a big house ");
    }
    
}

// Fther single inheritance (inherite the grandfather)
class Father extends  GrandFather{
    //father have its own property
    void Car(){
        System.out.println("Father have a Car ");
    }
}

//Son1 inhetites father and implements interface 
class Son1 extends  Father implements FamilyProperty{
    //son1 have its own properties 
    void Bick(){
        System.out.println("Son1 have a Bick");
    }
    //interface methos 
        @Override
    public void properties(){
    
        FamilyProperty.super.properties();
    }
   
}

// son 2 inherite Father 
class  Son2 extends  Father{
    void Laptop(){
   System.out.println("Son2 have a Laptop");
    }
}

public class Hybrid {
    
public static void main(String[] args) {
    Son1 Akash =new Son1();
    Akash.House();
    Akash.Car();
    Akash.Bick();
    Akash.properties();
    System.out.println("  ");


    Son2 Sujoy =new Son2();
    Sujoy.House();
    Sujoy.Car();
    Sujoy.Laptop();
    
}



}
/* .........NOTES ...................
Hybrid Inheritance is a combination of more than one type of inheritance. 

              GrandFather
                 |
              Father
              /    \
          Son1    Son2
             |
      RichFamily (Interface)*/