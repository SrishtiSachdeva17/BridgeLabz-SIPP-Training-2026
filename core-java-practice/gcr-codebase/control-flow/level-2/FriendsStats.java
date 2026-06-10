import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get age and height input for Amar
        System.out.print("Enter Amar's age and height (cm): ");
        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        // Get age and height input for Akbar
        System.out.print("Enter Akbar's age and height (cm): ");
        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        // Get age and height input for Anthony
        System.out.print("Enter Anthony's age and height (cm): ");
        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

        // Determine youngest friend based on smallest age
        int youngestAge = ageAmar;
        String youngestName = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestName = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestName = "Anthony";
        }

        // Determine tallest friend based on largest height
        double tallestHeight = heightAmar;
        String tallestName = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestName = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestName = "Anthony";
        }

        // Print details of the youngest and tallest friends
        System.out.println("The youngest friend is " + youngestName + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestName + " with height " + tallestHeight + " cm");

        // Close the Scanner Stream
        sc.close();
    }
}
