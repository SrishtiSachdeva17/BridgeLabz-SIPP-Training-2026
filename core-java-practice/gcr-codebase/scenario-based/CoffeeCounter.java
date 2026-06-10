import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        // Create a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        // Define price variables for coffee types
        double espressoPrice = 100.0;
        double lattePrice = 150.0;
        double cappuccinoPrice = 180.0;
        double americanoPrice = 120.0;

        // Define GST rate variable (5.0%)
        double gstRate = 5.0;

        // Run while loop for customer orders until exit is entered
        while (true) {
            // Ask for coffee type
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino, Americano or type 'exit'): ");
            String coffeeType = sc.next();

            // Check if user wants to exit
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting coffee counter system.");
                break;
            }

            // Ask for quantity ordered
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            // Initialize coffee price to 0.0
            double selectedPrice = 0.0;
            boolean isValidSelection = true;

            // Use switch statement to check coffee type and select price
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

            // Calculate total bill if selection is valid
            if (isValidSelection) {
                // Calculate base bill (price * quantity)
                double baseBill = selectedPrice * quantity;

                // Calculate GST amount
                double gstAmount = (baseBill * gstRate) / 100.0;

                // Calculate total bill including GST
                double totalBill = baseBill + gstAmount;

                // Print the bill details
                System.out.println("--- Invoice ---");
                System.out.println("Coffee: " + coffeeType);
                System.out.println("Quantity: " + quantity);
                System.out.println("Base Price: INR " + baseBill);
                System.out.println("GST (" + gstRate + "%): INR " + gstAmount);
                System.out.println("Total Bill: INR " + totalBill);
                System.out.println("---------------\n");
            }
        }

        // Close the Scanner Stream
        sc.close();
    }
}
