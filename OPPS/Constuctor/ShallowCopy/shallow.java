public class shallow {
    public static void main(String[] args) {

        int marks[] = {100, 45, 85};

        Student s1 = new Student("AKASH MONDAL", 20, marks);

        System.out.println("Original => Name: " + s1.name + " Age: " + s1.age);

        System.out.print("Marks: ");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i] + " ");
        }

        // Shallow copy
        Student s2 = new Student(s1);
        s2.marks[1] = 20;   // 🔥 change in copy

        System.out.println("\n\nCOPY => Name: " + s2.name + " Age: " + s2.age);

        System.out.print("Marks: ");
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i] + " ");
        }

        // Print original again to prove shallow copy
        System.out.println("\n\nAfter change, Original Marks:");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int age;
    int marks[];

    Student(String name, int age, int marks[]) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Shallow copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;  // 🔥 shared reference
    }
}



/*NOTE : ✅ Why YOUR code is called Shallow Copy 

👉 It is called shallow copy because the reference of the array is copied
 instead of creating a new array. Therefore, both objects share the same memory,
  and a change in one object affects the other.


*/