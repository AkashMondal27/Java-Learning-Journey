

public class Example {
    static int isMatch( int arr[], int key ,int i){
       
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i ;
        }
       return isMatch(arr, key , i+1) ;
    }

    public static void main(String[] args) {
            int arr[]={1,2,3,5,23,6,5,2,7,8};
            System.out.println( "Index : "+ isMatch(arr, 5, 0));
        }
}
