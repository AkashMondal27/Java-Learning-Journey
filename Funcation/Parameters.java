
import java.util.*;
public class Parameters {

    public static void PrintAkash(){
        System.out.println("Hi ...");
        System.out.println(" Akash Mondal .");
        System.out.println("How are you ?");
    }

    public static int  calculateSum( int a , int b) { // formal parameters
        int sum= a+ b;
        return sum;
    }

    public static void main(String[] args) { 
        int a,b ;
         try(Scanner sc= new Scanner(System.in)){
        System.out.print("Enter first number: ");
         a= sc.nextInt();
        System.out.print("Enter second number: ");
         b = sc.nextInt();
         }
         PrintAkash();
        int sum=  calculateSum(a,b);   // Arguments  or Actual parameters
        System.out.println("sum = " + sum);
    } 
}
