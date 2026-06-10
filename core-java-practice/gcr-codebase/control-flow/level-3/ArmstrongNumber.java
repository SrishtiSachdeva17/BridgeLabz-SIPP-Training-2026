import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        int number = sc.nextInt();

        // Initialize original number and sum variables
        int originalNumber = number;
        int sum = 0;

        // Run while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the last digit of the number
            int digit = originalNumber % 10;

            // Compute cube of the digit and add to sum
            int digitCube = digit * digit * digit;
            sum += digitCube;

            // Remove last digit from originalNumber
            originalNumber /= 10;
        }

        // Compare calculated sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
