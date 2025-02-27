import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
