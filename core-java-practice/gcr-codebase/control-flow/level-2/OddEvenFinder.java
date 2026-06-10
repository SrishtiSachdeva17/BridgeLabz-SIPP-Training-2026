import java.util.Scanner;

public class OddEvenFinder {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get upper limit from user
        int number = sc.nextInt();

        // Check if the input is a positive integer (Natural Number)
        if (number > 0) {
            // Iterate from 1 to the number using a for loop
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            // Print error message
            System.out.println("Error: Please enter a natural number.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
