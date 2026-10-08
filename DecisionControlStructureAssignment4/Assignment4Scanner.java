import java.util.Scanner;

public class Assignment4Scanner {
    public static void main(String[] args) {
        Scanner bagcal = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = bagcal.nextDouble();

        System.out.print("Enter age: ");
        int age = bagcal.nextInt();

        System.out.print("Citizenship (C/N): ");
        char citizen = bagcal.next().charAt(0);

        System.out.print("Recommendee (R/N): ");
        char recommendee = bagcal.next().charAt(0);

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
