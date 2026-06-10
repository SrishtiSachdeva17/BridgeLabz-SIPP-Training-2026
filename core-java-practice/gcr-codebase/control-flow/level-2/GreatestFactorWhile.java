import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get an integer input for the number
        int number = sc.nextInt();

        // Define greatestFactor variable and initialize to 1
        int greatestFactor = 1;

        // Check if the input is positive
        if (number > 1) {
            // Create a counter variable starting at number - 1
            int counter = number - 1;

            // Run a while loop down to 1 to find the greatest factor
            while (counter >= 1) {
                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    // Assign counter to greatestFactor
                    greatestFactor = counter;

                    // Break the loop as we found the greatest factor
                    break;
                }

                // Decrement counter
                counter--;
            }
        }

        // Print the greatest factor of the number beside itself
        System.out.println("The greatest factor of " + number + " beside itself is " + greatestFactor);

        // Close the Scanner Stream
        sc.close();
    }
}
