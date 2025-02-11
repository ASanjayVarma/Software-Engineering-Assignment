import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Multiplication
        double result = num1 * num2;

        // Display result
        System.out.println("Product: " + result);

        // Close scanner
        scanner.close();
    }
}
