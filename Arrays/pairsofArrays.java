public class pairsofArrays {


    public static void printpair( int [] Numbers){
        int totalPairs = 0;
       // to frint all the numbers 
       for( int i =0 ; i<Numbers.length ;  i++){
            int currentNumber= Numbers[i];
        //  for another number 
        for( int j= i+1 ; j<Numbers.length ; j++){
            System.out.print("("+currentNumber + ","+ Numbers[j]+ ") ");
            totalPairs ++;  
        }
        System.out.println(" ");
       }
        System.out.print(" total numbers of pairs = "+ totalPairs);
    }
    public static void main(String[] args) {
        int Numbers []={ 2,3,4,5,6,7,8,9};
            printpair(Numbers);
    }
}

/*   if we have total number of element in an Array = n
    then total pairs = {(n(n-1)) / 2} ;
 */
