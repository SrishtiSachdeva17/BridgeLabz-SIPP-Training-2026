import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double espressoPrice = 100.0;
        double lattePrice = 150.0;
        double cappuccinoPrice = 180.0;
        double americanoPrice = 120.0;

        double gstRate = 5.0;

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino, Americano or type 'exit'): ");
            String coffeeType = sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting coffee counter system.");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double selectedPrice = 0.0;
            boolean isValidSelection = true;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    selectedPrice = espressoPrice;
                    break;
                case "latte":
                    selectedPrice = lattePrice;
                    break;
                case "cappuccino":
                    selectedPrice = cappuccinoPrice;
                    break;
                case "americano":
                    selectedPrice = americanoPrice;
                    break;
                default:
                    System.out.println("Invalid coffee type entered.");
                    isValidSelection = false;
                    break;
            }

            if (isValidSelection) {
                double baseBill = selectedPrice * quantity;

                double gstAmount = (baseBill * gstRate) / 100.0;

                double totalBill = baseBill + gstAmount;

                System.out.println("--- Invoice ---");
                System.out.println("Coffee: " + coffeeType);
                System.out.println("Quantity: " + quantity);
                System.out.println("Base Price: INR " + baseBill);
                System.out.println("GST (" + gstRate + "%): INR " + gstAmount);
                System.out.println("Total Bill: INR " + totalBill);
                System.out.println("---------------\n");
            }
        }

        sc.close();
    }
}
