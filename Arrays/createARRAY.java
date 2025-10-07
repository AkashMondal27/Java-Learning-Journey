import  java.util.*;
public class createARRAY {
   public static void main(String[] args) {
       int marks[]=new int[50];  // array type --> Static , can not change the size in run time . 
        
       try( Scanner sc = new Scanner( System.in)){
          // input in arrays 
          marks[0]= sc.nextInt(); //physics 
          marks[2]= sc.nextInt(); // chemistry
          marks[3]=sc.nextInt(); // biology
          marks[5] = sc.nextInt(); // Maths

          //update the array 
          marks[5]= marks[5]+2;

          // output in  Arrays 
          System.out.println(" physics : "+ marks[0]);
          System.out.println(" chemistry : "+ marks[2]);
          System.out.println(" biology: "+ marks[3]);
          System.out.println(" Maths : "+ marks[5]);

          // lenth of array 
          System.out.println("lenth of array "+ marks.length);
          
       }
   
    } 
}
