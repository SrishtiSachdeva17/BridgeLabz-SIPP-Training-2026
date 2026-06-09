import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        int baseCm;
        int heightCm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of the triangle (cm): ");
        baseCm = sc.nextInt();
        System.out.print("Enter height of the triangle (cm): ");
        heightCm = sc.nextInt();
        int areaCm2 = (baseCm * heightCm) / 2;
        int areaInches2 = (int) (areaCm2 / 6.4516);
        System.out.println("The area of the triangle in square centimeters is " + areaCm2 + 
                           " and in square inches is " + areaInches2);
        sc.close();
    }
}
