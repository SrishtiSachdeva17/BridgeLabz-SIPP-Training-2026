import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get two double numbers and the operator
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        // Perform specific operations based on switch case statement
        switch (op) {
            case "+":
                double sum = first + second;
                System.out.println("Result: " + sum);
                break;
            case "-":
                double diff = first - second;
                System.out.println("Result: " + diff);
                break;
            case "*":
                double prod = first * second;
                System.out.println("Result: " + prod);
                break;
            case "/":
                // Check for division by zero
                if (second != 0.0) {
                    double quot = first / second;
                    System.out.println("Result: " + quot);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        // Close the Scanner Stream
        sc.close();
    }
}
