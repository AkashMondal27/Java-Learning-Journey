

public class Febonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fbn1 = fib(n - 1);
        int fbn2 = fib(n - 2);
        int fb = fbn1 + fbn2;
        return fb;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Fibonaci : " + fib(n));
    }
}