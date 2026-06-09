import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double baseCm;
        double heightCm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle (cm): ");
        baseCm = sc.nextDouble();
        System.out.print("Enter height of triangle (cm): ");
        heightCm = sc.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / 6.4516;
        System.out.println("The Area of the triangle in sq in is " + areaInches2 + 
                           " and sq cm is " + areaCm2);
        sc.close();
    }
}
