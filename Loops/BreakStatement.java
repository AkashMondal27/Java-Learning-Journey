/* WAP to find the highest factorial of a number n ( other than n itself) */

import java.util.*;
public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        try ( Scanner sc= new Scanner(System.in)){
            int n= sc.nextInt();

            for( int i=n/2 ; i>=1 ; i--){
                if( n% i==0){
                    System.err.println( i);
                    break; // to get ou the loop 
                }
            }


        }
    }
}
