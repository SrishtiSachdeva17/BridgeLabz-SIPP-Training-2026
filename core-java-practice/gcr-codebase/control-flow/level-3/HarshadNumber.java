import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        int number = sc.nextInt();

        // Initialize sum and temp copy variables
        int sum = 0;
        int temp = number;

        // Run while loop to find the sum of all digits
        while (temp != 0) {
            // Add last digit to sum
            sum += (temp % 10);

            // Remove last digit from temp
            temp /= 10;
        }

        // Check if number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
