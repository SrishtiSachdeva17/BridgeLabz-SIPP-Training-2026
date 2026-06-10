import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get starting value for factorial from user
        int number = sc.nextInt();

        // Check if the input is a positive integer (Natural Number)
        if (number > 0) {
            // Initialize factorial result to 1
            long factorial = 1;

            // Compute factorial using for loop
            for (int counter = 1; counter <= number; counter++) {
                factorial *= counter;
            }

            // Print the calculated factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            // Print error message if the number is not positive
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
