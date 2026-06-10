import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);
        sc.close();
    }
}
