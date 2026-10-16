

public class Factorial {
   public static  int fact(int n){

    if( n==0 || n==1){ // Bace condition
        return 1;    
    }

    int fn = n* fact( n-1);
    return fn;
   } 
 
   public static void main(String[] args) {
      int n=5 ;
      System.out.println(fact(n));
   }
    
}
