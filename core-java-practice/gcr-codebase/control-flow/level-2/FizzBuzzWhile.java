import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for number
        int number = sc.nextInt();

        // Check for positive integer (Natural Number)
        if (number > 0) {
            // Initialize counter
            int i = 1;

            // Loop from 1 to the entered number using a while loop
            while (i <= number) {
                // Check if current value is multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Check if current value is multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Check if current value is multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // Otherwise print the number itself
                else {
                    System.out.println(i);
                }

                // Increment counter
                i++;
            }
        } else {
            // Print error message
            System.out.println("Error: Please enter a positive integer.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
