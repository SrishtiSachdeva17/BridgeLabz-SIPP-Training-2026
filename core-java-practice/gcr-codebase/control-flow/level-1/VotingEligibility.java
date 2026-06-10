import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the age
        int age = sc.nextInt();

        // Check if the age is greater than or equal to 18 to determine voting eligibility
        if (age >= 18) {
            // Print eligibility confirmation message
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Print non-eligibility message
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
