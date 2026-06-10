import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        int number = sc.nextInt();

        // Initialize sum of divisors to 0
        int sum = 0;

        // Run for loop to find all proper divisors from 1 to number - 1
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                // Add i to sum
                sum += i;
            }
        }

        // Compare sum of proper divisors with the original number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
