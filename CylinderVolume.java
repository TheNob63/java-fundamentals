import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // User input for radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // User input for height
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
