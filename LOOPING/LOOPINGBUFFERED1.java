import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LOOPINGBUFFERED1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double highest = Double.MAX_VALUE;
        double lowest  = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + " of 10: ");
            double num = Double.parseDouble(br.readLine());

            if (num > highest) highest = num;
            if (num < lowest)  lowest  = num;
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest:  " + lowest);
    }
}
