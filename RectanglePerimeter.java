import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // User input for length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // User input for width
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 2 * (length + width);

        // Display the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
