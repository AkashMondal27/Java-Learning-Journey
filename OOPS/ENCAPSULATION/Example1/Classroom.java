 class Student{

  //private variables 
  private String name ;
  private int  age ;

  // setter methods 
   public void setName( String newName){
      name=newName ;
   }
    public void  setAge( int newAge){
    
        if (newAge <=0 ){
            age = 0 ;
        } else {
            age = newAge;
        }
    }


    // create getter 
    public String getName(){
      return name;
    }
   
    public int getAge(){
        return age;
    }


 }

public class Classroom {
    public static void main(String[] args) {
        Student s1= new Student() ;
        s1.setName("akash mondal");
        s1.setAge(-21);

        System.out.println("Name : "+ s1.getName());
        System.out.println("age  : "+ s1.getAge());
    

    }
}


/* NOTE :- WHhat Encapsulation ?
Encapsulation in Java means hiding data inside a class and 
allowing access through methods (getter and setter).


*/