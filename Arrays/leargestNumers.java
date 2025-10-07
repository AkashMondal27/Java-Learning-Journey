// find the smallest and largest number from an Array.

public class leargestNumers {

    public static int findNumber ( int numbers[]){
        int largestnumber = Integer.MIN_VALUE;  // -infinity
        int smalestnumber = Integer.MAX_VALUE;  // +infinity

        for( int i =1 ; i<numbers.length; i++ ){
            if( numbers[i] > largestnumber){
                largestnumber= numbers[i];
            }
            if( numbers[i]< smalestnumber){
                smalestnumber = numbers[i];
            }
        }
        System.out.println(" The smallest number is : "+ smalestnumber);
        return  largestnumber;
    }

      
    public static void main(String[] args) {
        int numbers []= { 2,4,6,3,5,1}; 

        System.out.println(" The largest value is : "+ findNumber(numbers));
    }
}
