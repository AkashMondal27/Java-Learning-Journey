/*  Import the Scanner class from the java.util package.
 This class helps us take input from the user.  */
import java.util.Scanner;

public class inputMessage {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);   // Create a Scanner object named 'sc' to read input from the keyboard (System.in).
        // String input = sc.next();  // Use the Scanner to read the next word entered by the user and store it in a variable called 'input'.
        //                             //sc.next() reads only one word (until a space).
        // System.out.println(input);

        String input2 =sc.nextLine();
        System.out.println(input2);

        int number = sc.nextInt();
        System.out.println(number);

        float price =sc. nextFloat();
        System.out.println(price);

        byte price2= sc.nextByte();
        System.out.println(price2); 

        double prise =sc.nextDouble();
        System.out.println(prise);

        
        boolean numm =sc.nextBoolean();
        System.out.println(numm);



    }
}
