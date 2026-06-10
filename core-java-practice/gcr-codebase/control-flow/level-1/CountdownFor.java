import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get starting value for the countdown from user
        int origCounter = sc.nextInt();

        // Run countdown down to 1 using for loop
        for (int counter = origCounter; counter >= 1; counter--) {
            // Print counter value
            System.out.println(counter);
        }

        // Close the Scanner Stream
        sc.close();
    }
}
