import java.util.*;
public class Ternary {
    public static void main(String[] args) {
         try(Scanner sc= new Scanner(System.in)){
         System.out.print("Enter a number : ");
         int number = sc.nextInt();
         String type= (number % 2 ==0) ? "even" : "odd";
         System.out.println(type);
         }
    }
}
