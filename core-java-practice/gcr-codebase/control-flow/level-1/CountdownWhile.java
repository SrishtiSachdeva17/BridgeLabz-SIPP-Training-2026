import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get starting value for the countdown from user
        int counter = sc.nextInt();

        // Run countdown down to 1 using while loop
        while (counter >= 1) {
            // Print counter value
            System.out.println(counter);

            // Decrement counter
            counter--;
        }

        // Close the Scanner Stream
        sc.close();
    }
}
