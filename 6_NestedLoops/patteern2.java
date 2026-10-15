import java.util.*;
public class patteern2 {
    public static void main(String[] args) {
        try ( Scanner sc= new Scanner(System.in)){
            System.out.print(" ENTER THE VALUE OF N : ");
            int n = sc.nextInt();
            for( int i =1 ; i<=n ; i++){
                for( int number=1; number<=i;number++){
                    System.out.print( number );
                }
                System.out.println("");
            }
        }
    }
}
