import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter double a: ");
        a = sc.nextDouble();
        System.out.print("Enter double b: ");
        b = sc.nextDouble();
        System.out.print("Enter double c: ");
        c = sc.nextDouble();
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        sc.close();
    }
}
