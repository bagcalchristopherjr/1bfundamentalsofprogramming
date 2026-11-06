import javax.swing.JOptionPane;

public class LOOPINGJOPTION1 {
    public static void main(String[] args) {
        double highest = Double.MAX_VALUE;
        double lowest  = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog(
                    null, "Enter number " + i + " of 10:");
            if (input == null) break;
            double num = Double.parseDouble(input.trim());

            if (num > highest) highest = num;
            if (num < lowest)  lowest  = num;
        }

        JOptionPane.showMessageDialog(null,
                "Highest: " + highest + "\nLowest:  " + lowest);
    }
}
