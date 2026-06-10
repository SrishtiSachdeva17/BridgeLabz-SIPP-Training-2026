import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get the input value for the number
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {
            // Print label for factors
            System.out.print("The factors of " + number + " are: ");

            // Run a for loop to find all factors (excluding the number itself)
            for (int i = 1; i < number; i++) {
                // Check if number is perfectly divisible by current i
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            // Print error message
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
