import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height (cm): ");
        int ageAmar = sc.nextInt();
        double heightAmar = sc.nextDouble();

        System.out.print("Enter Akbar's age and height (cm): ");
        int ageAkbar = sc.nextInt();
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter Anthony's age and height (cm): ");
        int ageAnthony = sc.nextInt();
        double heightAnthony = sc.nextDouble();

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

        System.out.println("The youngest friend is " + youngestName + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestName + " with height " + tallestHeight + " cm");

        sc.close();
    }
}
