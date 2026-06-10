import java.util.Scanner;

public class SumComparisonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;

            int loopSum = 0;

            for (int counter = 1; counter <= number; counter++) {
                loopSum += counter;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations match and are correct.");
            } else {
                System.out.println("Computations do not match.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        sc.close();
    }
}
