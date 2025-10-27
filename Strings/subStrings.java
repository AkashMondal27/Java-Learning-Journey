


public class subStrings {

    // making Substring funcation 
     public static String result( String name ,  int startINDX , int endingINDX ){
        String substr = "";
        for( int i = startINDX ; i< endingINDX ; i ++){
            substr +=  name.charAt(i);
        }
        return  substr ;
     }
    public static void main(String[] args) {
        String name = " akash mondal " ; 
         System.out.println( result ( name , 0 ,6));
         // existing substrings funcation 
         System.out.println( name.substring(0 , 4)); 
    }
}
