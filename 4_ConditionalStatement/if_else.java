
import java.util.*;

public class if_else {
    public static void main(String[] args) {
       try(Scanner sc= new Scanner(System.in)){
        System.out.print("Enter your age : ");
         int age = sc.nextInt();
         if(age>=18){
            System.out.println("You  can vote ");
         }else{
            System.out.println(" You can not vote ");
         }
       }

    }
}
