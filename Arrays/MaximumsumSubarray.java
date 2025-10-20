
public class  MaximumsumSubarray{

    public static void PrintSubarrays(int number[]) {
        int ts = 0; // total subarrays
        int currentSum = 0 ;
        int maximumSum = Integer.MIN_VALUE ;

        for (int i = 0; i < number.length; i++) { // start index
            for (int j = i; j < number.length; j++) { // end index
                
                for (int k = i; k <= j; k++) { // print from i to j
                    System.out.print(number[k] + " ");
                    currentSum += number[k]  ; // update the current sum 
                }
                ts++;

                if ( maximumSum < currentSum){
                    maximumSum = currentSum ;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + ts);
        System.out.println(" Maximum Sum = "+ maximumSum);
    }

    public static void main(String[] args) {
        // int number[] = {2, 4, 6, 8, 10};
         int number[] = {1, -2 , 6 ,-1, 3};
        PrintSubarrays(number);
    }
}
