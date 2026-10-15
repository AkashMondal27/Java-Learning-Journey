public class LinearSearch {

        public static  int findLS ( int numbers[] , int key ){

            for ( int i = 1; i<numbers.length ; i++){ // this will cheak every index in the given arrray 
                if( numbers[i]== key ){  // if the  value of a index == key valude then , return the index . 
                    return  i;
                }
            }
                return -1 ;
        }


    public static void main(String[] args) {
        int numbers[]={ 2,4,6,8,10,12,14,};
        int key= 10;

        int index = findLS( numbers, key);  // store the final result of findLS() in  "index"
        if ( index == -1){
            System.out.println("NOT FOUND THE KEY ");
        }else {
            System.out.println(" key is at the index : "+  index);
        }

    }
}
