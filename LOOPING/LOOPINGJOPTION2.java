import javax.swing.JOptionPane;

public class LOOPINGJOPTION2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= 100; i += 2) {
            sb.append(i).append("  ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}