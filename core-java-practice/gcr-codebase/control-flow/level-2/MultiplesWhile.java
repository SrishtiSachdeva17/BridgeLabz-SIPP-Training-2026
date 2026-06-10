import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.print("The multiples of " + number + " below 100 are: ");

            int counter = 99;

            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }

                counter--;
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
