import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get input value for the number
        int number = sc.nextInt();

        // Check if the number is a positive integer (Natural Number)
        if (number > 0) {
            // Compute the sum of natural numbers using the formula n * (n + 1) / 2
            int sum = number * (number + 1) / 2;

            // Print the sum results
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Print message showing the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
