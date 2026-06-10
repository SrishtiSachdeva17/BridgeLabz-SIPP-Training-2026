import java.util.Scanner;

public class CourseFeeInput {
    public static void main(String[] args) {
        int fee;
        int discountPercent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course fee (INR): ");
        fee = sc.nextInt();
        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextInt();
        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + discountedFee);
        sc.close();
    }
}
