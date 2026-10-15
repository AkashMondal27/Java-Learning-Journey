import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the value of n : ");
        int n =sc.nextInt();
        int sum = 0;

        for( int i =0; i<=n ; i++){
            sum+=i ;
            
        }
        System.out.println(sum);
        }
    }
}
