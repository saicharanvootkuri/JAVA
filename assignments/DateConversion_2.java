import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateConversion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date and time (dd/MM/yyyy HH:mm): ");
        String userInput = sc.nextLine();

        // Using "dd/MM/yyyy HH:mm" for day, month, year, hour, and minute
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate date = LocalDate.parse(userInput, formatter);
        LocalTime time = LocalTime.parse(userInput.split(" ")[1], DateTimeFormatter.ofPattern("HH:mm"));

        System.out.print("Enter hours to increment: ");
        int hoursToAdd = sc.nextInt();
        System.out.print("Enter minutes to increment: ");
        int minutesToAdd = sc.nextInt();

        System.out.print("Enter hours to decrement: ");
        int hoursToSubtract = sc.nextInt();
        System.out.print("Enter minutes to decrement: ");
        int minutesToSubtract = sc.nextInt();

        LocalDate newDate = date.plusDays(1);
        LocalDate decDate = date.minusDays(10);
        LocalTime newTime = time.plusHours(hoursToAdd).plusMinutes(minutesToAdd);
        LocalTime decTime = time.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);

        String output = newDate.atTime(newTime).format(formatter);
        String output_1 = decDate.atTime(decTime).format(formatter);

        System.out.println("Incremented date and time: " + output);
        System.out.println("Decremented date and time: " + output_1);
    }
}
