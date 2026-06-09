import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        int km;
        int miles;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextInt();
        miles = (int) (km / 1.6);
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        sc.close();
    }
}
