import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int originalNumber = number;
        int count = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;

            count++;
        }

        System.out.println("The number of digits in " + number + " is " + count);

        sc.close();
    }
}
