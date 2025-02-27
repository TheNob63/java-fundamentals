import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // User input for Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // User input for Rate of Interest
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        // User input for Time period
        System.out.print("Enter the Time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
