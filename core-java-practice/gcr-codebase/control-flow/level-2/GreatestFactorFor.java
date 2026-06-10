import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get an integer input for the number
        int number = sc.nextInt();

        // Define greatestFactor variable and initialize to 1
        int greatestFactor = 1;

        // Check if the input is positive
        if (number > 1) {
            // Run a for loop backward from number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                // Check if number is perfectly divisible by current i
                if (number % i == 0) {
                    // Assign i to greatestFactor
                    greatestFactor = i;

                    // Break the loop as we found the greatest factor
                    break;
                }
            }
        }

        // Print the greatest factor of the number beside itself
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);

        // Close the Scanner Stream
        sc.close();
    }
}
