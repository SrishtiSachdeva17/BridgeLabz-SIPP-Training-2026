import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        int distanceInFeet;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = sc.nextInt();
        int distanceInYards = distanceInFeet / 3;
        int distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance of " + distanceInFeet + " feet is " + 
                           distanceInYards + " yards and " + 
                           distanceInMiles + " miles");
        sc.close();
    }
}
