/*   Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers. */

import java.util.*;
public class question1 {
    public static void main(String[] args) {
       try ( Scanner sc = new Scanner(System.in)){
        System.out.println("Enter three number : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float average = (a+b+c)/3 ;
        System.err.println("Average of three nummbeer is : " + average);
       }
    }
}
