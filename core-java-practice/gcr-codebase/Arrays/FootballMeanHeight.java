import java.util.Scanner;

class FootballMeanHeight {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double[] heights = new double[11];
      double sum = 0.0;

      System.out.println("Enter the heights of 11 players:");
      for (int i = 0; i < heights.length; i++) {
         double h = input.nextDouble();
         if (h <= 0.0) {
            System.err.println("Invalid height. Height must be positive.");
            System.exit(0);
         }
         heights[i] = h;
         sum += h;
      }

      double mean = sum / heights.length;
      System.out.println("The mean height of the football team is: " + mean);

      input.close();
   }
}
