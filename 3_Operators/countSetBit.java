// Count Set Bits in a Number 
public class countSetBit {
    public static int COUNTBITS( int n ){
        int counter =0;
        while( n> 0){
            if((n & 1) != 0){
                counter ++ ;
            }
              n= n >>1 ; 
        }
        return  counter ;
    }
    public static void main(String[] args) {
        System.out.println(COUNTBITS(15));
    }
}
