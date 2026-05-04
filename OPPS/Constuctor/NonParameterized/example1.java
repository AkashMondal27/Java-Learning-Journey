

public class example1 {
    public static void main(String[] args) {

        Students s1 = new Students();
        System.out.println("Name of student is " + s1.name);
        System.out.println("Age of student is " + s1.age);
        System.out.println("Percentage of student is " + s1.percentage);
        
    }
}


class  Students{  //create a classs 
    String name ;
    int age ;
    float percentage ;

  //cerate a constorctor , same name as class name and no return type
    Students (){    // non parameterized constructor
        this.name = "akash mondal" ;
        this.age = 20 ;
        this.percentage = 85.5f ;
    }

  


}