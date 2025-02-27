import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // User input for base
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // User input for exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the power
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
