import java.util.InputMismatchException;
import java.util.Scanner;
public class FloatStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double average = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;

        int count = 0;

        // We want a sample size of five floating point numbers - this tells the program to continue
        // running until is reaches five floating point numbers input.
        while(count < 5) {
            System.out.print("Enter a floating-point value: ");

            // Changed the way the program ensures that the input is valid.
            // Going with a try-catch block instead of an if-else statement.
            try {
                double value = scanner.nextDouble();
                total += value;

                // If the value is greater than the current maximum, it then becomes the maximum
                if(value > maximum) {
                    maximum = value;
                }

                // If the value is lower than the current minimum, it becomes the minimum
                if(value < minimum) {
                    minimum = value;
                }
                count++; // Increase count by one
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a floating-point value.");
                scanner.next();
            }
        }

        average = total / 5;
        double interest = total * 0.2;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Interest - on total at 20%: " + interest);
    }
}
