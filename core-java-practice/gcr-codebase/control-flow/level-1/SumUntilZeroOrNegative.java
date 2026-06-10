import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Create total variable initialized to 0.0
        double total = 0.0;

        // Use infinite while loop to get values until 0 or negative
        while (true) {
            // Prompt user and take input
            System.out.print("Enter a number (0 or negative to exit): ");
            double value = sc.nextDouble();

            // Check if the user entered 0 or a negative number to break the loop
            if (value <= 0) {
                break;
            }

            // Add value to total sum
            total += value;
        }

        // Print final total sum
        System.out.println("The total sum is: " + total);

        // Close the Scanner Stream
        sc.close();
    }
}
