import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // User input for distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        // Close the scanner
        scanner.close();
    }
}
