import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bagcal = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        double height = Double.parseDouble(bagcal.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(bagcal.readLine());

        System.out.print("Citizenship (C/N): ");
        char citizen = bagcal.readLine().charAt(0);

        System.out.print("Recommendee (R/N): ");
        char recommendee = bagcal.readLine().charAt(0);

        if (recommendee == 'R' || recommendee == 'r') {
            System.out.println("ACCEPTED");
        } else if (height >= 200 && age >= 21 && age <= 25
                && (citizen == 'C' || citizen == 'c')) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
        bagcal.close();
    }
}