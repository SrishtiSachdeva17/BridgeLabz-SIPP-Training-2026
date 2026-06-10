import java.util.Scanner;

public class PCMGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int totalMarks = physics + chemistry + maths;
        int totalSubjects = 3;
        double percentage = (double) totalMarks / totalSubjects;

        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, High, First Class with Distinction";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, First Class";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, Second Class";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, Third Class";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 0, Pass";
        } else {
            grade = "R";
            remarks = "Fail";
        }

        System.out.println("Average Mark: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
