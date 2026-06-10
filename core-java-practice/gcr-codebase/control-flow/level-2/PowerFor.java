import java.util.Scanner;

public class PowerFor {
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

            // Run a for loop to multiply the base number power times
            for (int i = 1; i <= power; i++) {
                result *= number;
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
