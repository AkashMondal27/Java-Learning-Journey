public class Logical {
    public static void main(String[] args) {
        int a = 11;
        int b= 10;
        int c = 16;
        // Logical AND &&
        System.out.println( " Logical AND (&&)");
        System.out.println( (a>b) &&( c>a) );
        System.out.println( (a>b) &&( c<a) );
        System.out.println( (a<b) &&( c>a) );
        System.out.println( (a<b) &&( c<a) );
 
        // Logical OR  || 
        System.out.println( " Logical OR (||)");
        System.out.println( (a>b) || ( c>a) );
        System.out.println( (a>b) || ( c<a) );
        System.out.println( (a<b) || ( c>a) );
        System.out.println( (a<b) || ( c<a) );

        // Logical not ! 
        System.out.println( " Logical NOT (!)");
        System.out.println( !(a>b)  );
        System.out.println( !(a<b) );
       
    }
}
