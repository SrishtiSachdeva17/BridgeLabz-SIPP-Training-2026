import java.util.Scanner;

public class SumComparisonFor {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get user input number
        int number = sc.nextInt();

        // Check if the input is a Natural number
        if (number > 0) {
            // Compute sum using standard formula: n * (n + 1) / 2
            int formulaSum = number * (number + 1) / 2;

            // Initialize loop sum variable
            int loopSum = 0;

            // Compute sum using for loop
            for (int counter = 1; counter <= number; counter++) {
                loopSum += counter;
            }

            // Print sums from both methods
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare both sums and print verification status
            if (formulaSum == loopSum) {
                System.out.println("Both computations match and are correct.");
            } else {
                System.out.println("Computations do not match.");
            }
        } else {
            // Print error message
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
