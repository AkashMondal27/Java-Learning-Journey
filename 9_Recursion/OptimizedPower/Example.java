
public class Example {

    static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = power(a, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return a * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5)); // 32
        System.out.println(power(2, 6)); // 64
    }
}
