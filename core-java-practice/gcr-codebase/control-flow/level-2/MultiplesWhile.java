import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get the input value for the number
        int number = sc.nextInt();

        // Check if the number is positive and less than 100
        if (number > 0 && number < 100) {
            // Print label for multiples
            System.out.print("The multiples of " + number + " below 100 are: ");

            // Create a counter variable starting at 99 (below 100)
            int counter = 99;

            // Use while loop till counter is greater than or equal to 1
            while (counter >= 1) {
                // Check if counter is perfectly divisible by number (i.e. counter is a multiple)
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }

                // Decrement counter
                counter--;
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
