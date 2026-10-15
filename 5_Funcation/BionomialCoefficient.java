public class BionomialCoefficient {
    
    public static int factorial(int a){
        int f=1;
        for( int i = 1; i<=a ; i++){
            f= f*i;
        }
        return  f;
    }

    public static int binco(int n, int r){
      int fac_n =factorial(n);
      int fac_r = factorial(r);
      int fac_nr = factorial(n-r);
      int bincoa =fac_n/(fac_r  * fac_nr);
      return bincoa;
    }
    public static void main(String[] args) {
        System.out.print(binco(6, 2));
    }
}
