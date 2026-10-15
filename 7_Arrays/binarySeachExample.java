/* Given a sorted array arr = [1, 3, 5, 7, 9, 11, 13, 15], find the index of the element 9 using binary search.  */

public class binarySeachExample {
         public static int BinarySearchExample ( int []arr , int tergerElement){
             int firstIndex= 0;
             int lastIndex = arr.length - 1;
             int midIndex = ( firstIndex + lastIndex)/2 ;
           

             while( firstIndex <= lastIndex){

                if ( arr[midIndex] == tergerElement){
                    return midIndex ;
                } else if (arr[midIndex] < tergerElement ){
                    return  midIndex + 1 ;
                } else {
                    return midIndex - 1;
                }
             }
            return -1 ;
         }

    public static void main(String[] args) {
        int arr []= {1, 3, 5, 7, 9, 11, 13, };
        int tergerElement = 9 ;

        int result = BinarySearchExample(arr, tergerElement);
         if ( result == -1 ){
            System.out.println(" The element not found .");
         } else {
            System.out.println("The  element "+ tergerElement + " is in the index of "+ result);
         }
    }
}
