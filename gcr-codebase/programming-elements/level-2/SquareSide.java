import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        double perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter of the square: ");
        perimeter = sc.nextDouble();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + 
                           " whose perimeter is " + perimeter);
        sc.close();
    }
}
