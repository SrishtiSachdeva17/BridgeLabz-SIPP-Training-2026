import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Get weight and height input values
        double weightKg = sc.nextDouble();
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100.0;

        // Calculate BMI (weight / height^2)
        double bmi = weightKg / (heightMeters * heightMeters);

        // Initialize status variable
        String status = "";

        // Determine weight status based on BMI guidelines
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi < 30.0) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Print final BMI value and status description
        System.out.println("BMI Value: " + bmi);
        System.out.println("Weight Status: " + status);

        // Close the Scanner Stream
        sc.close();
    }
}
