import java.awt.geom.Arc2D;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TaxWithholding {
    public static void main(String[] args) {
        // Changed "income" to "weeklyIncome" for more specificity
        double weeklyIncome = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weekly income: ");

        // Added a try-catch block to make sure the user inputs a valid variable, prevent issues
        // with the user inputting strings, etc...
        try {
            weeklyIncome = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("The variable you input was not a double. Cannot calculate your tax withholding.");
            System.exit(0);
        }

        double taxRate = 0;

        if(weeklyIncome < 500) {
            taxRate = 0.10;
        } else if(weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if(weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double taxWithholding = weeklyIncome * taxRate;
        System.out.print("Weekly tax withholding: $" + taxWithholding);
    }
}
