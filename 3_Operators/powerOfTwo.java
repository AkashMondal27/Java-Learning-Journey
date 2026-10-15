// check if a number is power of 2 or not
public class powerOfTwo {
    public static boolean  ispweroftwo( int n){
        return n > 0 &&(n & (n-1))==0 ;
        
    }
    public static void main(String[] args) {
       int n = 8;
       if( ispweroftwo(n) == true){
        System.out.println(" the number is power of 2");
       }else{
        System.out.println(" the is not a power of 2 ");
       }
        
      
    }
}
