/*  
  *****
   ***
    *
 */

public class pattern5 {

    public static void main(String[] args) {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
