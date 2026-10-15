public class Example {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Akash");

        Student.college = "SSU";

        Student s2 = new Student();
          s2.setName("Akash2");

        System.out.println("Name : " + s1.getName());

        System.out.println("College : " + Student.college);
    }
}

class Student {

    String name;

    static String college;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}