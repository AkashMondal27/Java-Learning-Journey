

public class ecample1 {
      public static void main(String[] args) {
          Student s1= new Student ();
            System.out.println(s1);
          Student s2= new Student ("akash mondal");
            System.out.println(s2.name);
          Student s3= new Student (20);
            System.out.println(s3.age);
          Student s4= new Student ("akash mondal", 20, 85.5f);
            System.out.println(s4.name + ", " + s4.age + ", " + s4.percentage);
        
      }
}


class Student {
     String name;
     int age;
     float percentage;


     Student(){
        System.out.println("Constructor is called");
     }

     Student (String name ){
        this.name = name ;

     }

     Student(int age ){
        this.age = age ;
        
     }

    Student(String name, int age, float percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
         
    }
     
}
