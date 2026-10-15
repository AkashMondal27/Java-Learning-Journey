

public class example {
   public static void main(String[] args) {
       example  obj= new example() ;  // create the object 
        System.out.println("Name :" +obj.name);     
        System.out.println("Age :" +obj.age);
        System.out.println("Email :" +obj.email);
     }





    //creta the private class
    private  final String name = "AKASH MONDAL";  // we can't access this variable outside the class 
    private final int age = 25;
    private final String email = "akak@gmail.com";
}


/* Private Access Modifier : we can't access private variable outside the class in which it is declared .
 we can only access private variable inside the same class in which it is declared .  

 final keyword is used to declare a constant variable which value can't be changed once it is assigned . */
