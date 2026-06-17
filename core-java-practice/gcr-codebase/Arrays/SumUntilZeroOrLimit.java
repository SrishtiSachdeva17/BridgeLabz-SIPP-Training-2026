import java.util.Scanner;

class SumUntilZeroOrLimit {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double[] numbers = new double[10];
      double total = 0.0;
      int index = 0;

      System.out.println("Enter numbers (up to 10 numbers, or enter 0 or a negative number to stop):");
      while (true) {
         if (index == 10) {
            break;
         }
         double value = input.nextDouble();
         if (value <= 0.0) {
            break;
         }
         numbers[index] = value;
         index++;
      }

      System.out.println("Numbers entered:");
      for (int i = 0; i < index; i++) {
         System.out.println(numbers[i]);
         total += numbers[i];
      }

      System.out.println("Total sum: " + total);
      input.close();
   }
}
