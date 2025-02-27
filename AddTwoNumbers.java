import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        // Close scanner
        scanner.close();
    }
}
