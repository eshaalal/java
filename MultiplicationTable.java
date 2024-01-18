import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");

        // Read the user's input as an integer
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Display the multiplication table using a for loop
        System.out.println("\nMultiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
