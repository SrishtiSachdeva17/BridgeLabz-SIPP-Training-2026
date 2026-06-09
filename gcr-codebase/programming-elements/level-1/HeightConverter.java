import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        int heightCm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        heightCm = sc.nextInt();
        int totalInches = (int) (heightCm / 2.54);
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + inches);
        sc.close();
    }
}
