

public class example1 {
    public static void main(String[] args) {
        Student s1= new Student("akash mondal");
        System.out.println(s1.name);
    }
}


class Student {
    String name;
    int roll ;

    Student(String name ){
      this.name=name;
    }
}