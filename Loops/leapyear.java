//Print all leap years between 2000 and 2100.
public class leapyear {

    public static void main(String[] args) {
        System.out.println("Leap years between 2000 and 2100 are:");

        for (int year = 2000; year <= 2100; year++) {
            // Leap year condition:
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
            }
        }
    }
}
