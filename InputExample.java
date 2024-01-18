import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input as a string
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's input as an integer
        int age = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Display the entered information
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}
