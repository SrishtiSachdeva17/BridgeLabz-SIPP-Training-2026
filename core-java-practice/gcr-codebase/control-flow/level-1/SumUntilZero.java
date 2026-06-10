import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Create total variable initialized to 0.0
        double total = 0.0;

        // Prompt user and take initial input value
        System.out.print("Enter a number (0 to exit): ");
        double value = sc.nextDouble();

        // Use while loop to sum numbers until the user enters 0
        while (value != 0.0) {
            // Add user entered value to total
            total += value;

            // Prompt user and take next input value
            System.out.print("Enter a number (0 to exit): ");
            value = sc.nextDouble();
        }

        // Print the final sum
        System.out.println("The total sum is: " + total);

        // Close the Scanner Stream
        sc.close();
    }
}
