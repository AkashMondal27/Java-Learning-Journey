import java.util.Scanner;

public class InterestCal{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in);){

        // Input
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Simple Interest Formula
        double simpleInterest = (principal * rate * time) / 100;

        // Compound Interest Formula
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        // Output
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);
    }
        }
}
