// keep entering number till user enters a multiple of 10 . 

import java.util.*;
public class question1 {
    public static void main(String[] args) {
        try( Scanner sc= new Scanner(System.in)){
            

            do { 
                System.err.println("enter your number :");
                int n = sc.nextInt();
                
                if( n % 10 ==0){
                    break;
                }
                System.out.println(n);
            } while (true);
        }
    }
}
