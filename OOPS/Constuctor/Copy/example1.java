

public class example1 {
   public static void main(String[] args) {
    
   //Original Object
   Student s1= new Student("akash", 20 ,10);
   System.out.println("Name : "+ s1.name + " Age : "+ s1.age + " Percentage : "+ s1.percentage);
   

   //copy object using COPY CONSTRUCTOR 
   Student s2 =new Student(s1);
   s2.percentage = 15 ;
    System.out.println("S2 -> Name: " + s2.name + " Age: " + s2.age + " Percentage: " + s2.percentage);

   }
}


class Student {
    String name ;
    int age ;
    float percentage ;

// normal constructor
    Student(String name, int age, float percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
 

    // Copy Constructor 
    Student(Student s1){
    this.name= s1.name;
    this.age = s1.age ;
   
    }

}