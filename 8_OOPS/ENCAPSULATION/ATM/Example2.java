import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            ATMmachine dubrajpur = new ATMmachine();

            // enter deposit amount
            System.out.print("Enter Deposit Amount: ");
            double depositAmount = sc.nextDouble();

            dubrajpur.deposite(depositAmount);

            // enter withdraw amount
            System.out.print("Enter Withdraw Amount: ");
            double withdrawAmount = sc.nextDouble();

            dubrajpur.widraw(withdrawAmount);

            // show current balance
            System.out.println("Current Balance: " + dubrajpur.getBalance());
        }
    }
}

class ATMmachine {

    // private data
    private double balance;

    // deposit method
    public void deposite(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    // withdraw method
    public void widraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // getter method
    public double getBalance() {
        return balance;
    }
}