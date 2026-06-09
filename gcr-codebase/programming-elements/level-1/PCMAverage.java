public class PCMAverage {
    public static void main(String[] args) {
        String studentName = "Sam";
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        int totalSubjects = 3;
        int totalMarksObtained = mathsMark + physicsMark + chemistryMark;
        int averagePercentage = totalMarksObtained / totalSubjects;
        System.out.println(studentName + "'s average mark in PCM is " + averagePercentage + "%");
    }
}
