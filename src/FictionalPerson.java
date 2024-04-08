import java.util.Scanner;

public class FictionalPerson {
    String firstName = "";
    String lastName = "";
    String address = "";
    String city = "";
    int zip = 0;

    public static void main(String[] args) {
        FictionalPerson newPerson = new FictionalPerson();

        // Scanner implemented to track and use input from user
        Scanner scanner = new Scanner(System.in);

        // New user input...
        System.out.println("Enter a first name:");
        newPerson.firstName = scanner.nextLine();

        // New user input...
        System.out.println("\nEnter a last name:");
        newPerson.lastName = scanner.nextLine();

        // New user input...
        System.out.println("\nEnter an address:");
        newPerson.address = scanner.nextLine();

        // New user input...
        System.out.println("\nEnter a city:");
        newPerson.city = scanner.nextLine();

        // New user input...
        System.out.println("\nEnter a zip code:");
        newPerson.zip = scanner.nextInt();

        System.out.println("First Name: " + newPerson.firstName + "\n" +
                            "Last Name: " + newPerson.lastName + "\n" +
                            "Street Address: " + newPerson.address + "\n" +
                            "City: " + newPerson.city + "\n" +
                            "Zip Code: " + newPerson.zip);
    }
}

/*
    Reviewing this program, it runs properly without any corrections needed.
    I believe that in order to make it more modular, you could allow the user to input
    their own information to full the variables, and then print from there. So, in order for
    there to be some change, I chose to go ahead and allow for user input.
*/
