import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get 3 input values for numbers
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // Check if the first number is the smallest among all three
        boolean isFirstSmallest = (number1 < number2 && number1 < number3);

        // Print the result showing if the first number is the smallest
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the Scanner Stream
        sc.close();
    }
}
