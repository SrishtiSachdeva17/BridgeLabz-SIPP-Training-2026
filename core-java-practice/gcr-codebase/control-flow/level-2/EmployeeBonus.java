import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get salary and years of service from employee
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        // Bonus percentage decided by Zara (5% if years > 5)
        double bonusPercentage = 5.0;

        // Initialize bonus amount to 0.0
        double bonusAmount = 0.0;

        // Check if years of service is more than 5 years
        if (yearsOfService > 5) {
            // Compute bonus amount
            bonusAmount = (salary * bonusPercentage) / 100.0;
        }

        // Print the calculated bonus amount
        System.out.println("The bonus amount is INR " + bonusAmount);

        // Close the Scanner Stream
        sc.close();
    }
}
