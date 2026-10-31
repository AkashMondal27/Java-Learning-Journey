

public class Example1 {

     public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
                System.out.println(arr[i]+" ");
        }
     }

     //Recursive function
     public static void mergeShort(int arr[] , int si , int ei){
         if (si >= ei) {  // Base case 
             return;
         }
         int mid= si + (ei - si)/2 ; // devide in 2 partes 
         mergeShort(arr, si, mid);  //for the lest part ending index is middle of the array
         mergeShort(arr, mid+1, ei);  // right side startinf is from mid + 1
         merge(arr , si , mid , ei);
     }

     // Now merge all the 2 individuals inside array
     public  static void merge(int arr[] ,int si ,int mid ,int ei){
        
           // left(0,3) right(4,6) => 6 -0_1 = 7 arr element will be there in temporary array[]
            int temp[]= new int[ei-si +1]  ;
            int i = si; //left 
            int j= mid+1;  //right 
            int k = 0;

            while (i<=mid && j <= ei){ // left side starting index  < right  starting index , the both sied array is sorted
               if(arr[i] < arr[j]){   // 1st element of left side arr[] < 1st element of right side arr[]  
                  temp[k]= arr[i];  

                  i++ ; 
               }else{
                   temp[k]=arr[j];
                  j++;
               }
               k++;
            }

            // // Copy remaining elements from left subarray
            while(i <= mid){
               temp[k++]=arr[i++] ; 
            }

            // Copy remaining elements from right subarray
            while(j <= ei){
               temp[k++]= arr[j++];
            }

            // Copy temporary in original array
            for(k=0 ,i= si; k<temp.length ; k++ ,i++ ){
               arr[i]= temp[k];
            }

     }


  public static void main(String[] args) {
      int arr[]={6,3,9,5,2,8};
      mergeShort(arr, 0, arr.length-1); // Starting index 0 & ending index arr.length -1  
      printArr(arr);
   }
}
