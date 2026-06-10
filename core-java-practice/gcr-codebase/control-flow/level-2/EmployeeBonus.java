import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        double bonusPercentage = 5.0;

        double bonusAmount = 0.0;

        if (yearsOfService > 5) {
            bonusAmount = (salary * bonusPercentage) / 100.0;
        }

        System.out.println("The bonus amount is INR " + bonusAmount);

        sc.close();
    }
}
