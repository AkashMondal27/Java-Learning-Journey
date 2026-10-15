public class clearLastBit {
    public static int CLEARBIT( int n ,int i ){
        int bitmask = ((~0)<< i);
        return  n & bitmask ;
    }

    public static void main(String[] args) {
        System.out.println(CLEARBIT(15 , 2));
    }
}
