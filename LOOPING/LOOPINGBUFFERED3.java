import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LOOPINGBUFFERED3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000.00;

        while (true) {
            System.out.printf("Balance: P%.2f%n", balance);
            System.out.print("Enter amount (positive=deposit, negative=withdraw, 0=exit): ");
            String input = br.readLine();
            double amount = Double.parseDouble(input.trim());

            if (amount == 0) break;

            if (amount < 0) {
                double withdraw = -amount;
                if (withdraw > balance) {
                    System.out.println("INSUFFICIENT FUNDS!");
                } else {
                    balance -= withdraw;
                    System.out.printf("Withdrawn: P%.2f%n", withdraw);
                    System.out.printf("New Balance: P%.2f%n%n", balance);
                }
            } else {
                balance += amount;
                System.out.printf("Deposited: P%.2f%n", amount);
                System.out.printf("New Balance: P%.2f%n%n", balance);
            }
        }

        System.out.printf("Final Balance: P%.2f%n", balance);
    }
}