import java.util.*;

public class DecimalToBinary {

    public static void DecimalNtoBinaryN( int decimalN){
      int binaryN =0;
      int power = 0;
    
        while( decimalN>0){
            int remainder = decimalN % 2 ;
            binaryN =  binaryN + (remainder *(int )Math.pow(10, power));
            power ++ ;
            decimalN= decimalN/2 ;
        }
        System.out.println("The converted Binary Number is " + binaryN);
    }


    public static void main(String[] args) {
        try( Scanner sc= new Scanner( System.in)){
            System.out.println("Enter the decimal Number : ");
            int decimalN = sc. nextInt();

            DecimalNtoBinaryN(decimalN);

        }     
    }
}
