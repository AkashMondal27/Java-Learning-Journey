public class FuncationOverloading {
   // (1) Funcation Overloading using  " Parameters" 
 
    public static int sum ( int a , int b){  //using 2  number
        return a+ b;
    }
    public static int sum( int a , int b, int c){ // using 3 number 
        return a+b+c ;
    }

     // (2) Funcation Overloading using  " Data Types" 

       public static int sumDT ( int a , int b ){  // int datatype 
          return a+b ;
       }
       public static float sumDT ( float a , float b ){ // float datatype
          return a+b ;
       }
    public static void main(String[] args) {
        System.out.println("(1) Funcation Overloading using Parameters ");
        System.out.println(" sum of a+b = "+sum(3,3 ));  // diffeertent parameters
        System.out.println(" sum of a+b+c = "+sum(3,1,3 ));
        System.out.println("(2) Funcation Overloading using Data Types ");
        System.out.println("sumDT = "+(sumDT(5, 5)));
        System.out.println("sumDT = "+(sumDT(2.3f,6.7f)));
}
}
