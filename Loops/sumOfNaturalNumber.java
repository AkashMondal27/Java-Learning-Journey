import  java.util.*;
public class sumOfNaturalNumber {
   public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the value of n : ");
        int n =sc.nextInt();
        int sum = 0;

        int i =1;
        while( i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum of n natural number is : "+ sum );
       }
   } 
}
