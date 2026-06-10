import java.util.Scanner;

public class BMITracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weightKg = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double heightMeters = sc.nextDouble();

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("Client's BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Category: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        sc.close();
    }
}
