import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            long factorial = 1;

            int counter = 1;

            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        sc.close();
    }
}
