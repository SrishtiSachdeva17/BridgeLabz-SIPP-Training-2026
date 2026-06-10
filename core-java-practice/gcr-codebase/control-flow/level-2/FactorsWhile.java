import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("The factors of " + number + " are: ");

            int counter = 1;

            while (counter < number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }

                counter++;
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        sc.close();
    }
}
