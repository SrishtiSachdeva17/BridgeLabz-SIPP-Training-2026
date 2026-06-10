import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Define candidate names
        String candidate1 = "Candidate A";
        String candidate2 = "Candidate B";
        String candidate3 = "Candidate C";

        // Initialize vote tallies for candidates
        int votesCandidate1 = 0;
        int votesCandidate2 = 0;
        int votesCandidate3 = 0;
        int totalVotes = 0;

        // Define exit code variable
        int exitCode = -1;

        // Run loop for multiple voters
        while (true) {
            // Prompt voter for age input (or special code to exit)
            System.out.print("Enter voter age (or -1 to exit and show results): ");
            int age = sc.nextInt();

            // Check if special exit code was entered
            if (age == exitCode) {
                System.out.println("Voting closed. Displaying final results...\n");
                break;
            }

            // Verify eligibility (age >= 18)
            if (age >= 18) {
                System.out.println("Eligible to vote!");
                System.out.println("Candidates: \n1. " + candidate1 + "\n2. " + candidate2 + "\n3. " + candidate3);
                System.out.print("Record your vote (1, 2, or 3): ");
                int choice = sc.nextInt();

                // Increment respective candidate's tally using switch or if-else
                if (choice == 1) {
                    votesCandidate1++;
                    totalVotes++;
                } else if (choice == 2) {
                    votesCandidate2++;
                    totalVotes++;
                } else if (choice == 3) {
                    votesCandidate3++;
                    totalVotes++;
                } else {
                    System.out.println("Invalid candidate option. Vote not recorded.");
                }
            } else {
                System.out.println("The person is not eligible to vote (must be 18 or older).\n");
            }
        }

        // Print final statistics
        System.out.println("--- Election Statistics ---");
        System.out.println("Total Votes Cast: " + totalVotes);
        System.out.println(candidate1 + " Votes: " + votesCandidate1);
        System.out.println(candidate2 + " Votes: " + votesCandidate2);
        System.out.println(candidate3 + " Votes: " + votesCandidate3);
        System.out.println("---------------------------");

        // Close the Scanner Stream
        sc.close();
    }
}
