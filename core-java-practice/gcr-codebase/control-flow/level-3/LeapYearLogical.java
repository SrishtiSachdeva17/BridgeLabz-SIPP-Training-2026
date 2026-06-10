import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get the year input from the user
        int year = sc.nextInt();

        // Check if year is in Gregorian calendar (year >= 1582)
        if (year >= 1582) {
            // Check leap year conditions using a single if statement with logical && and ||
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            // Print message if the year is before the Gregorian calendar start
            System.out.println("The year " + year + " is before the Gregorian calendar (1582).");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
