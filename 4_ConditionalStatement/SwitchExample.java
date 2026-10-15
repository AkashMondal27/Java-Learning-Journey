import java.util.*;

public class SwitchExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number between 1 to 4: ");
            int num = sc.nextInt();

            switch (num) {
                case 1 -> System.out.println("PEN");
                case 2 -> System.out.println("BOOK");
                case 3 -> System.out.println("NOTEBOOK");
                case 4 -> System.out.println("PENCIL");
                default -> System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }
    }
}
