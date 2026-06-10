import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get inputs for base number and power exponent
        int number = sc.nextInt();
        int power = sc.nextInt();

        // Check if both are positive integers
        if (number > 0 && power >= 0) {
            // Create result variable initialized to 1
            long result = 1;

            // Create a temp variable counter and initialize to zero
            int counter = 0;

            // Use while loop till counter reaches power
            while (counter < power) {
                // Multiply result by number
                result *= number;

                // Increment counter
                counter++;
            }

            // Print the power result
            System.out.println(number + " raised to the power of " + power + " is " + result);
        } else {
            // Print error message
            System.out.println("Error: Please enter positive integers (power can be zero).");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
