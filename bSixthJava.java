import javax.swing.JOptionPane;          // Import dialog box class from swing
public class bSixthJava {                // Declare class named bSixthJava
    public static void main(String[] args) {   // Program entry point, starts here
        String name = "";                // Declare name, initialize to empty
        name = JOptionPane.showInputDialog("Please enter your name");  // Pop-up asks name, returns String

        String msg = "Hello " + name + "!";   // Build greeting by joining strings
        JOptionPane.showMessageDialog(null, msg); // Pop-up shows greeting
    }
}

