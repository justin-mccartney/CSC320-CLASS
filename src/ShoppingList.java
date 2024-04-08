import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items you are shopping for: ");
        int totalItems = scanner.nextInt();
        scanner.nextLine();

        String[] shoppingList = new String[totalItems];

        // Adding items...
        for(int i = 0; i < totalItems; i++) {
            System.out.print("Enter item " + (i + 1 ) + ": ");
            shoppingList[i] = scanner.nextLine();
        }

        // Show list...
        for(int i = 0; i < totalItems; i++) {
            System.out.println((i + 1) + ". " + shoppingList[i]);
        }

        scanner.close();
    }
}
