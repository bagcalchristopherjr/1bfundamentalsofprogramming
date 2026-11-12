public class ArrayPROB2 {
    public static void main(String[] args) {
        double[] temperatures = new double[5];

        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        System.out.println("Daily Temperatures:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        temperatures[2] = 32.0;

        System.out.println("Updated temperature for Day 3: " + temperatures[2]);
    }
}
