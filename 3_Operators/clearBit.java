public class clearBit  {
     public static int results(int n , int i ){
        int bitmask= ~(1<< i) ;
       return  n & bitmask;

    }
    public static void main(String[] args) {
        System.out.println( results(10 , 1));
    }
}
 