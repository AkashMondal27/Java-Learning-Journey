import java.util.*;  //- This imports all  class from the java.util package.

public class inputSum {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a=sc.nextInt();
       System.out.print("Enter second  number: ");
       int b=sc.nextInt();
       int sum = a+b;
       System.out.print("The sum of the number is : ");
       System.out.println(sum); 
       sc.close();  // closes the scanner
   } 
}
