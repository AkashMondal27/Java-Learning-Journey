// Write a program to check triangle validity.
public class question {

    public static void main(String[] args) {
        int a = 5, b = 19, c = 4;

        if(a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
