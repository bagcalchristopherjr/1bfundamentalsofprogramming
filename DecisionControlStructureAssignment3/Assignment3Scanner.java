import java.util.Scanner;

public class Assignment3Scanner {
    public static void main(String[] args){

        Scanner BAGCAL = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(BAGCAL.nextLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(BAGCAL.nextLine());

        System.out.print("Enter entrance exam score: ");
        double entrance = Double.parseDouble(BAGCAL.nextLine());

        double average = (nsat + entrance) / 2;
        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "REJECTED";
        } else if (salary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        } else {
            result = "FOR FURTHER STUDY";
        }

        System.out.println();
        System.out.println("NSAT score        : " + nsat);
        System.out.println("Parents' salary   : " + salary);
        System.out.println("Entrance exam     : " + entrance);
        System.out.println("Average           : " + average);
        System.out.println("Application status: " + result);

        BAGCAL.close();
    }
}
