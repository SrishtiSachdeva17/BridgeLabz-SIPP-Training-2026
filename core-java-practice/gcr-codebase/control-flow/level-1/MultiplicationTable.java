import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get starting value for table
        int number = sc.nextInt();

        // Using for loop, print multiplication table of number from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Calculate result for current multiplier
            int result = number * i;

            // Print formatted row: number * i = result
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close the Scanner Stream
        sc.close();
    }
}
