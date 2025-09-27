import java.util.*;
public class sqarepattern {
    public static void main(String[] args) {
        try( Scanner sc= new Scanner(System.in)){
            System.out.println("Enter the number of n : ");
            int n =sc.nextInt();

            for (int i =1; i<=n; i++){
                for(int j =1; j<=n; j++){
                    System.out.print(" * ");
                }
                System.out.println("   ");
            }
        }
    }
    
}
