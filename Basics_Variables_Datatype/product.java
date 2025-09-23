import java.util.*;  //- This imports all  class from the java.util package.

public class product {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a=sc.nextInt();
       System.out.print("Enter second  number: ");
       int b=sc.nextInt();
       int c = a+b;
       System.out.print("The product of the number is : ");
       System.out.println(c); 
       sc.close();  // closes the scanner
   } 
}
