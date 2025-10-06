public class primeNumber {

    public static boolean isprime(int n){
        boolean  prime = true;
        for( int i =1 ; i<=n; i++){
            if (n%2==0 ){
                prime= false;
            }
        }
        return  prime;
    }


    // Another Optimized process to check the numer is prime ot not 

    public static boolean  isPrime( int n){
        if(n==2){
            return true;
        }
        
        for( int i=1 ; i<= Math.sqrt(n);){
            if( n% i==0){
                return  false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(isprime(7));
        System.out.println(isPrime(15));
    }
    
}
