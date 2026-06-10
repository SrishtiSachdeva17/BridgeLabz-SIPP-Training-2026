import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        int number = sc.nextInt();

        // Initialize original number and count variables
        int originalNumber = number;
        int count = 0;

        // Run loop until originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Remove last digit in each iteration
            originalNumber /= 10;

            // Increment digit count
            count++;
        }

        // Print final digits count
        System.out.println("The number of digits in " + number + " is " + count);

        // Close the Scanner Stream
        sc.close();
    }
}
