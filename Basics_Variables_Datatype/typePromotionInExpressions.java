public class typePromotionInExpressions {
    public static void main(String[] args) {
        short a = 5 ;
        byte b = 24;
        char c= 'c';    
        System.out.println(a+b+c);  // byte ,short, char  => int
        
        int m =10;
        float n =10.12f ;
        long o =20;
        double p = 12;
        System.out.println(m+n+o+p); //if onw operand is long , float , double  => long ,float,double 

    }
}
