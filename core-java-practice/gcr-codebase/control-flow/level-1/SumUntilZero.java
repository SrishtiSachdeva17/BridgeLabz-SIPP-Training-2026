import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.print("Enter a number (0 to exit): ");
        double value = sc.nextDouble();

        while (value != 0.0) {
            total += value;

            System.out.print("Enter a number (0 to exit): ");
            value = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
