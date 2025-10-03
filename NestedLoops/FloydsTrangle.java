import java.util.*;
public class FloydsTrangle {
    public static void main(String[] args) {
        try( Scanner sc= new Scanner(System.in)){
            System.out.println(" Enter the n :");
            int n = sc.nextInt();
            int counter=1;

            for(int i= 1; i<=n; i++){
                for(int j =1; j<=i ; j++){
                    System.out.print(counter + " ");
                    counter++;

                }
                System.out.println("");
            }

        
        }
    }
}
