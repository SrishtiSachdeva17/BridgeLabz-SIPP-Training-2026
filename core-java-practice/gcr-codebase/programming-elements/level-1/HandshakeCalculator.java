import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        numberOfStudents = sc.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes possible among " + numberOfStudents + 
                           " students is " + maxHandshakes);
        sc.close();
    }
}
