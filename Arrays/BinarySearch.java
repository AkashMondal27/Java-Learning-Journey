public class BinarySearch {
    
       public static int BINARYSEARCH( int []arr , int tergerElement){
            int firstIndex = 0 ;
            int lastIndex = arr.length -1;
            int midIndex= (( firstIndex + lastIndex)/2 );

        // write the condition to find thr target value
       while ( firstIndex <= lastIndex ){
            if( arr[midIndex] == tergerElement){
                return  midIndex ;  // Terget found ,return midindex1;

            } else if( arr[midIndex] < tergerElement ){
                return midIndex + 1 ;  // Search in the rigtht half 

            }else {
                return  midIndex - 1 ;  // Search in the left half 
            }

       }
         return  -1;  // Terget not found 
       }


    public static void main(String[] args) {
         int []arr = { 2,4,6,8,10,12,14,16,18,20};
         int tergerElement  = 12; 

        int result = BINARYSEARCH(arr, tergerElement);
        
        if ( result == -1 ){
            System.out.println(" THE TERGET ELEMENT NOT FOUND ");
        }else {
            System.err.println(" Terget element = "+ tergerElement + " foound at index "+ result);
        }
        
    }
}
