

class classroom {
   protected String fname = "AKASH";
  protected String lname = "MONDAL";
  protected String email = "john@doe.com";
  protected int age = 24;
}

class students extends classroom{
    public static void main(String[] args) {
        students obj = new students();  // create the object of class students
        System.out.println("First Name :" +obj.fname);     
        System.out.println("Last Name :" +obj.lname);
        System.out.println("Email :" +obj.email);
        System.out.println("Age :" +obj.age);
    }
}

/* Protected ;- the code is accessible in the same package and subclasses .
 Here "extends" keyword is used to inherit the properties of the parent class . */