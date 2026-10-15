public class ReverseArray {

        public static void revese ( int arr[]){
            int first =0 ; int last = arr.length - 1;

            while( first < last){

                int tem = arr[ last];
                arr[ last]= arr[ first];
                arr[first] = tem;

                first ++;
                last -- ;
            }
        
        }
   
    public static void main(String[] args) {
        int arr []={ 2,4,6,8,10};

        revese(arr);
        for( int i= 0 ; i<arr.length ; i++ ) {
            System.out.print(arr[i]+ " ");
        }
    }
}

/* NOTE :-   Time Complexity =  O(n)  ; Space Complexity = Constant =1; */