import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

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

        sc.close();
    }
}
