//print 1 to 20 except 3 & 8

public class ContinueStatement {
    public static void main(String[] args) {
        for( int i=0 ;i<=20 ; i++){
            if( i==3 || i==8){
                 continue;
                }
            System.out.println( i); 
        }
       
    }
}
