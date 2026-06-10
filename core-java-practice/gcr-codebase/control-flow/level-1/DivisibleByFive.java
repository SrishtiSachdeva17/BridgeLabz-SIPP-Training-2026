import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Print the result showing if the number is divisible by 5
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close the Scanner Stream
        sc.close();
    }
}
