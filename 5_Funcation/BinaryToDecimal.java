public class BinaryToDecimal {
    
    public static void bintdec(int binaryN){
        int pow=0; // power
        int decino=0; // decimal no
        int mybinoray = binaryN;
        while( binaryN > 0){
            int lastdigit = binaryN % 10 ;

            decino = decino + ( lastdigit * (int)Math.pow( 2,pow));  // math.pow always give "Double value" , typecust it in int value ;
                pow ++ ;
                binaryN = binaryN/10 ;
        }
            System.out.println(" Decimal number of "+ mybinoray+ " is = "+ decino);
    }
    
    
    
    public static void main(String[] args) {
        bintdec(101);
}
}
