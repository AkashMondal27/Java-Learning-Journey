

public class deep {
    
    public static void main(String[] args) {

        int marks[] = {100, 45, 85};

        Student s1 = new Student("AKASH MONDAL", 20, marks);

        System.out.println("Original => Name: " + s1.name + " Age: " + s1.age);

        System.out.print("Marks: ");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i] + " ");
        }

        // Deep copy
        Student s2 = new Student(s1);
        s2.marks[1] = 20;   // 🔥 change in copy

        System.out.println("\n\nCOPY => Name: " + s2.name + " Age: " + s2.age);

        System.out.print("Marks: ");
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i] + " ");
        }

        // Print original again
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

    // ✅ Deep copy constructor
    @SuppressWarnings("ManualArrayToCollectionCopy")
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;

        // 🔥 create new array
        this.marks = new int[s1.marks.length];

        // copy values
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}


/* NOTE :- ✅ Why it is called Deep Copy

👉 It is called deep copy because a new memory is created and all 
values are copied into it, so both objects are independent and
 changes in one do not affect the other.
*/