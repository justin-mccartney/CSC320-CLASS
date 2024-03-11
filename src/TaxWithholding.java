import java.util.Scanner;
public class TaxWithholding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weekly income: ");

        double income = scanner.nextDouble();
        double taxRate = 0;

        if(income < 500) {
            taxRate = 0.10;
        } else if(income < 1500) {
            taxRate = 0.15;
        } else if(income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double taxWithholding = income * taxRate;
        System.out.print("Weekly tax withholding: $" + taxWithholding);
    }
}
