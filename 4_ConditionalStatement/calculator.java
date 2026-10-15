import java.util.*;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number : ");
            int a = sc.nextInt();
             System.out.println("Enter the second number : ");
            int b = sc.nextInt();
             System.out.println("Enter the operator: ");
            char operator = sc.next().charAt(0);

            int result ;

            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}
