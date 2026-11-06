import javax.swing.JOptionPane;

public class LOOPINGJOPTION3 {
    public static void main(String[] args) {
        double balance = 20000.00;
        int count = 1;

        while (true) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Balance: P" + String.format("%.2f", balance) + "\n" +
                            "Enter amount (positive=deposit, negative=withdraw, 0=exit):");
            if (input == null) break;

            double amount = Double.parseDouble(input.trim());
            if (amount == 0) break;

            if (amount < 0) {
                double withdraw = -amount;
                if (withdraw > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                } else {
                    balance -= withdraw;
                    JOptionPane.showMessageDialog(null,
                            "Withdrawn: P" + String.format("%.2f", withdraw) +
                                    "\nNew Balance: P" + String.format("%.2f", balance));
                }
            } else {
                balance += amount;
                JOptionPane.showMessageDialog(null,
                        "Deposited: P" + String.format("%.2f", amount) +
                                "\nNew Balance: P" + String.format("%.2f", balance));
            }
            count++;
        }

        JOptionPane.showMessageDialog(null,
                "Final Balance: P" + String.format("%.2f", balance));
    }
}
