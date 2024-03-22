import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> weekdays = new ArrayList<>();
        ArrayList<Integer> temperatures = new ArrayList<>();

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        temperatures.add(75);
        temperatures.add(83);
        temperatures.add(73);
        temperatures.add(68);
        temperatures.add(77);
        temperatures.add(84);
        temperatures.add(67);

        double sum = 0;
        for(int i = 0; i < temperatures.size(); i++) {
            sum += temperatures.get(i);
        }
        double weekAverage = sum / temperatures.size();

        boolean continueRunning = true;
        do {
            System.out.print("\nPlease enter a weekday to see the daily temperature, " +
                    "type the word 'Week' in order to see the weekly average, " +
                    "or type the word 'Quit' to exit the program: ");
            String userInput = scanner.next();

            if (userInput.equals("Monday") || userInput.equals("monday")) {
                System.out.print("The temperature for " + weekdays.get(0) + " is " + temperatures.get(0) + " degrees.");
            } else if (userInput.equals("Tuesday") || userInput.equals("tuesday")) {
                System.out.print("The temperature for " + weekdays.get(1) + " is " + temperatures.get(1) + " degrees.");
            } else if (userInput.equals("Wednesday") || userInput.equals("wednesday")) {
                System.out.print("The temperature for " + weekdays.get(2) + " is " + temperatures.get(2) + " degrees.");
            } else if (userInput.equals("Thursday") || userInput.equals("thursday")) {
                System.out.print("The temperature for " + weekdays.get(3) + " is " + temperatures.get(3) + " degrees.");
            } else if (userInput.equals("Friday") || userInput.equals("friday")) {
                System.out.print("The temperature for " + weekdays.get(4) + " is " + temperatures.get(4) + " degrees.");
            } else if (userInput.equals("Saturday") || userInput.equals("saturday")) {
                System.out.print("The temperature for " + weekdays.get(5) + " is " + temperatures.get(5) + " degrees.");
            } else if (userInput.equals("Sunday") || userInput.equals("sunday")) {
                System.out.print("The temperature for " + weekdays.get(6) + " is " + temperatures.get(6) + " degrees.");
            } else if (userInput.equals("Week") || userInput.equals("week")) {
                System.out.print("The weeks average temperature is " + weekAverage + " degrees.");
            } else if (userInput.equals("Quit") || userInput.equals("quit")) {
                System.out.print("Exiting the program...");
                continueRunning = false;
            } else {
                System.out.print("Please enter a valid input... i.e. a weekday, 'week', or 'quit'...");
            }
        } while(continueRunning);
    }
}
