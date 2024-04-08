import java.util.ArrayList;
import java.util.*;

public class TemperatureTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // How I would change the name - weekdays to daysOfWeek
            // ArrayList<String> daysOfWeek = new ArrayList<>();

        // How I would change the name - temperatures to dailyTemps
            // ArrayList<Integer> dailyTemps = new ArrayList<>();

        // Hash map filled with the days of the week and the temperatures of each day
        Map<String, Integer> daysAndTemps = new HashMap<>();
        daysAndTemps.put("Monday", 75);
        daysAndTemps.put("Tuesday", 83);
        daysAndTemps.put("Wednesday", 73);
        daysAndTemps.put("Thursday", 68);
        daysAndTemps.put("Friday", 77);
        daysAndTemps.put("Saturday", 84);
        daysAndTemps.put("Sunday", 67);

        // Calculating the total temp and average weekly temperature - together
        int averageWeeklyTemp = 0;
        for(int temp : daysAndTemps.values()) {
            averageWeeklyTemp += temp;
        }
        averageWeeklyTemp /= daysAndTemps.size();

        boolean continueRunning = true;
        while(continueRunning) {
            System.out.print("Enter a day of the week (e.g., Monday, Tuesday...), type 'Week' for the weekly average temperature, or type 'Quit' to exit the program: ");
            String userInput = scanner.nextLine();

            // Adding '.toLowerCase()' in order to make it not case-sensitive
            if(daysAndTemps.containsKey(userInput)) {
                 System.out.println("The temperature for " + userInput + " is " + daysAndTemps.get(userInput) + " degrees.");
            } else if(userInput.equalsIgnoreCase("Week")) {
                 System.out.println("The average temperature for the week is " + averageWeeklyTemp + " degrees.");
            } else if(userInput.equalsIgnoreCase("Quit")) {
                 System.out.println("Exiting program...");
                 continueRunning = false;
            } else {
                 System.out.println("Please enter a valid input (e.g., a weekday line 'Monday', the word 'Week', or 'Quit': ");
            }

        }
    }
}
