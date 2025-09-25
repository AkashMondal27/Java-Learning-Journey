public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a ;
        int c = a++;
        int d= a;
        System.out.println(b); // pre-increment   1> change the value  2> use the value
        System.out.println(c);  // post- increment  .  1>use the value     2> change the valus 
        System.out.println(d);
    }
}
