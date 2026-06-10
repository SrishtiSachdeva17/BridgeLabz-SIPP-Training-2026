import java.util.Scanner;

public class BMITracker {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get weight input in kilograms
        System.out.print("Enter weight in kg: ");
        double weightKg = sc.nextDouble();

        // Get height input in meters
        System.out.print("Enter height in meters: ");
        double heightMeters = sc.nextDouble();

        // Compute BMI using formula BMI = weight / (height * height)
        double bmi = weightKg / (heightMeters * heightMeters);

        // Print calculated BMI value
        System.out.println("Client's BMI is: " + bmi);

        // Classify weight category using if-else structures
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Category: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        // Close the Scanner Stream
        sc.close();
    }
}
