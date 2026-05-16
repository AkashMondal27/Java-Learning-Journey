public class Example {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();

        // Setting static variable
        s1.college = "SSU";

        // Creating second object
        Student s2 = new Student();

        // Accessing static variable using second object
        System.out.println("COLLEGE : " + s2.college);
    }
}

class Student {

    String name;   // non-static variable (separate for every object)

    // static variable (shared by all objects)
    static String college;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}