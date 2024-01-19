import java.util.Scanner;

public class Assignment31 {


    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number in inches
        System.out.print("Enter the number in inches: ");

        // Read the input from the user
        double inches = scanner.nextDouble();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Convert inches to meters (1 inch = 0.0254 meters)
        double meters = inches * 0.0254;

        // Display the result
        System.out.println(inches + " inches is equal to " + meters + " meters.");
    }
}