import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get the input value for the number
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number > 0) {
            // Print label for factors
            System.out.print("The factors of " + number + " are: ");

            // Create a counter variable starting at 1
            int counter = 1;

            // Run a while loop to find all factors (excluding the number itself)
            while (counter < number) {
                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }

                // Increment counter
                counter++;
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
