public class arraysAaArgument {

     public static void update( int marks[]){
        for( int i =0; i<marks.length ; i++){
            marks[i]= marks[i] + 1;
        }
     }

    public static void main(String[] args) {
        int marks[] ={ 98,96,94,96,91};
        update(marks);

        // print the marks of arrays 

        for( int i =0 ; i<marks.length ; i++){
            System.out.println( marks[i]);
        }
        System.out.println("");
    }
}

/*  
NOTE :- // Arrays are passed by reference in Java, so changes made in this method will affect the original array.
*/