import java.util.Arrays;

public class ArrayPROB1 {
    public static void main(String[] args) {
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}
        };

        System.out.println("Row 2, Seat 3: " + seats[1][2]);

        seats[0][1] = "Vacant";

        System.out.println(Arrays.deepToString(seats));
    }
}
