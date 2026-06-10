import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get the input value for the number
        int number = sc.nextInt();

        // Check if the number is positive and less than 100
        if (number > 0 && number < 100) {
            // Print label for multiples
            System.out.print("The multiples of " + number + " below 100 are: ");

            // Run a for loop backward from i = 100 down to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is perfectly divisible by number (i.e. i is a multiple)
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            // Print error message
            System.out.println("Error: Please enter a positive integer less than 100.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
