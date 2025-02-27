import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // User input for three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average
        double average = (num1 + num2 + num3) / 3;

        // Display the result
        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}
