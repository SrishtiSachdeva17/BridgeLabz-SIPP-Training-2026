import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int origCounter = sc.nextInt();

        for (int counter = origCounter; counter >= 1; counter--) {
            System.out.println(counter);
        }

        sc.close();
    }
}
