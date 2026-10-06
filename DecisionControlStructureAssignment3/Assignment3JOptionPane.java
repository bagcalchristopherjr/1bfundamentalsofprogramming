import javax.swing.JOptionPane;
public class Assignment3JOptionPane {
    public static void main (String[] args){

        String nsat = JOptionPane.showInputDialog("Enter NSAT Score");
        double nsatscore = Double.parseDouble(nsat);

        String monthlyS = JOptionPane.showInputDialog("Enter parents monthly salary");
        double Msalary = Double.parseDouble(monthlyS);

        String exam = JOptionPane.showInputDialog("Enter entrance exam score");
        double examscore = Double.parseDouble(exam);

        double average = (nsatscore + examscore) / 2;
        String result;

        if (Msalary > 10000 || nsatscore < 90 || examscore < 85) {
            result = "REJECTED";
        } else if (Msalary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        } else {
            result = "FOR FURTHER STUDY";
        }

        JOptionPane.showMessageDialog(null,
                        "NSAT score          :  " + nsatscore +
                        "\nParents' salary   :  " + Msalary +
                        "\nEntrance exam     :  " + examscore +
                        "\nAverage           :  " + average +
                        "\nApplication status:  " + result,
                        "RESULTS", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
