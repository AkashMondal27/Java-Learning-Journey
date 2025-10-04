import  java.util.*;

public class product {

        public static int multiply(int a , int b){
            int multiply = a*b ;
            return  multiply;
             
        }

       
    public static void main(String[] args) {
        int a ;
        int b ;
        try( Scanner sc = new Scanner( System.in)){
            System.out.println(" Enter the 1st number : ");
            a = sc.nextInt();
            System.out.println("Enter the 2nd number : ");
            b = sc.nextInt();
            
        }
        int pro = multiply(a, b);
        System.out.println(" a * b = "+ pro);
    }
}
