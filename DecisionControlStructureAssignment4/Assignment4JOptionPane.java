import javax.swing.JOptionPane;

public class Assignment4JOptionPane {
    public static void main(String[] args) {
        String height = JOptionPane.showInputDialog("Enter height in cm:");
        double height1 = Double.parseDouble(height);

        String age = JOptionPane.showInputDialog("Enter age:");
        int age1 = Integer.parseInt(age);

        String citezen = JOptionPane.showInputDialog("Citizenship (C/N):");
        char citizen1 = citezen.charAt(0);

        String rStr = JOptionPane.showInputDialog("Recommendee (R/N):");
        char recommendee = rStr.charAt(0);

        if (recommendee == 'R' || recommendee == 'r') {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else if (height1 >= 200 && age1 >= 21 && age1 <= 25
                && (citizen1 == 'C' || citizen1 == 'c')) {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null, "REJECTED");
        }
    }
}