
import  java.util.*;

public class inputOutputStrings {
    
    public static void main(String[] args) {
        String str = " a, b , c ";

        String str2 = new String("akash mondal ");

         System.out.println( str );
          System.out.println( str2 );

          try( Scanner sc = new Scanner ( System.in )){
            System.out.println(" enter the string ");
            String name = sc.nextLine();
            System.out.println(name);

            // coount the length of a Strings 
            System.out.println( name.length());
          }

          // concatenation  
          String firstname = " akash ";
          String lastname = " mondal";
          String fullname = firstname + lastname ;
          System.out.println(" the full name is ; "+ fullname);
        for( int i = 0; i < fullname.length() ; i ++){
            System.out.println( fullname.charAt(i));
        }

    }
}
