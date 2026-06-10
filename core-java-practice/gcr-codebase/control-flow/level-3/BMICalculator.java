import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weightKg = sc.nextDouble();
        double heightCm = sc.nextDouble();

        double heightMeters = heightCm / 100.0;

        double bmi = weightKg / (heightMeters * heightMeters);

        String status = "";

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi < 30.0) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("BMI Value: " + bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
