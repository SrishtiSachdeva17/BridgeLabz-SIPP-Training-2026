import java.util.Scanner;

class OddEvenSplit {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();

      if (number <= 0) {
         System.err.println("Error: Number must be a natural number (greater than 0).");
         System.exit(0);
      }

      int size = number / 2 + 1;
      int[] even = new int[size];
      int[] odd = new int[size];
      int evenIndex = 0;
      int oddIndex = 0;

      for (int i = 1; i <= number; i++) {
         if (i % 2 == 0) {
            even[evenIndex] = i;
            evenIndex++;
         } else {
            odd[oddIndex] = i;
            oddIndex++;
         }
      }

      System.out.println("Even numbers:");
      for (int i = 0; i < evenIndex; i++) {
         System.out.print(even[i] + " ");
      }
      System.out.println();

      System.out.println("Odd numbers:");
      for (int i = 0; i < oddIndex; i++) {
         System.out.print(odd[i] + " ");
      }
      System.out.println();

      input.close();
   }
}
