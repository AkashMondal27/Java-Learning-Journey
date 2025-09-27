import  java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
           try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a positive number : ");
            int n = sc.nextInt();
            int returnDigit= 0; // now 1st return digit is 0;

            while( n!=0){
                int lastDigit =n%10 ;   //  1st 1234 %10 =4, 2nd 123 % 10=3,  3rd12 % 10 =2
                returnDigit *= 10;     // 1st ,0*10=0 , 2nd 4*10=40  
                returnDigit += lastDigit; // 1st 0+4=4, 2nd 40+3=43
                n = n/10 ; // remove the last digit from the number  .1st 1234/10 =123 ,remove the 4  2nd 123/10 =12,remove the 3
            }
                System.out.println("The reverse Number is : " + returnDigit);
           }
    }
}
