import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        int number = sc.nextInt();

        // Initialize isPrime to true
        boolean isPrime = true;

        // Verify if number is greater than 1
        if (number > 1) {
            // Loop from 2 to number - 1 to check for divisors
            for (int i = 2; i < number; i++) {
                // Check if number is divisible by current i
                if (number % i == 0) {
                    // Number is not prime if divisible by i
                    isPrime = false;
                    break;
                }
            }

            // Print the check results
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        } else {
            // Print message for values less than or equal to 1
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
