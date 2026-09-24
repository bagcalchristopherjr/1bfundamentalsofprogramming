import java.util.Scanner; // Imports the Scanner class for input.
import java.util.InputMismatchException; // Imports class to handle input mismatches.

public class bFifthJava { // Declares the main public class name.
    public static void main (String[] args){ // Main method where the program starts.

        String name; // Declares variable to store user name.
        int age; // Declares variable to store user age.
        Scanner inputDevice = new Scanner(System.in); // Creates Scanner object for keyboard input.

        try{ // Starts block to check for errors.
            System.out.print("Please enter your name: "); // Prompts user to input their name.
            name = inputDevice.nextLine(); // Reads a line from the keyboard.

            System.out.print("Please enter your age: "); // Prompts user to input their age.
            // Throws error if text is typed.
            age = inputDevice.nextInt(); // Reads an integer from the keyboard.

            System.out.println("Your name is " +name+ " and you are " +age+ " years old"); // Prints the user name and age.
        } catch (InputMismatchException e) { // Catches errors if input is text.
            // Displays friendly error instead of crashing.
            System.out.println("Error must be a whole number."); // Prints friendly message for input error.
        } finally { // Block that runs regardless of errors.
            inputDevice.close(); // Closes scanner preventing memory leak.
        }
    }
}
