import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number2 = sc.nextInt();
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + 
                           number1 + " and " + number2 + " is " + 
                           addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        sc.close();
    }
}
