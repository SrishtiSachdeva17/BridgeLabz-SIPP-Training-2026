import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        a = sc.nextInt();
        System.out.print("Enter integer b: ");
        b = sc.nextInt();
        System.out.print("Enter integer c: ");
        c = sc.nextInt();
        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        sc.close();
    }
}
