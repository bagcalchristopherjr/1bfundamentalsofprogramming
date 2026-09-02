public class Assignment3 {
    public static void main(String[] args){
        String firstName = "Christopher";
        String lastName = "Bagcal";
        String locAddress = "Rosales";
        // String is used for firstName, lastName, and locAddress because they represent multiple characters
        String mobileNumber = "09938465007";
        // String is again used for mobileNumber because it is too big for int and cannot put a zero when using both int and long
        int age = 18;
        // int is used for age because it is the most used for whole numbers
        double gwa = 92.50;
        // double is then used for gwa because of the decimals, though float can be used too

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + locAddress);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Age: " + age);
        System.out.println("GWA: " + gwa);
    }
}
