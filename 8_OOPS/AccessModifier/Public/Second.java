//crrate 2bd class to access the public variable of class Main

 class Second {
     public static void main(String[] args) {
         Main myOBJ =new Main();      // creating an object of class Main
          System.err.println("Name :"+ myOBJ.name);
            System.out.println("Email :"+ myOBJ.email);
             System.out.println("Age :"+ myOBJ.age);

     }
}
