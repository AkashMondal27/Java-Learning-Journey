// Write a Java program to count the number of vowels and consonants in a String.
public class VowelCoount {

    public static void  counter( String city ){
          int VowelCounter =0;
          int ConsonantCounter = 0 ;
          city = city.toLowerCase(); // make all letter to lowercase
            
            for ( int i =0 ; i< city.length(); i ++){
                char ch = city.charAt(i); 

                if ( ch >= 'a' && ch <= 'z'){
                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                        VowelCounter ++ ;
                    } else {
                        ConsonantCounter ++ ;
                    }
                }
            }
            System.out.println(" Vowels = "+ VowelCounter);
            System.out.println(" consonant  = "+ ConsonantCounter);
            
        }
        public static void main(String[] args) {
            String city = "kolata is called the city of joy .";
            counter(city);
    }
}
