
import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter value of A : ");
             int A = sc.nextInt();
             System.out.print("Enter value of B : ");
             int B = sc.nextInt();
            if(A>B){
                 System.out.println( A +" = Ais largest.");
            }else{
                System.out.println(B+ " = B is largest");
         }
        }
    }
}
