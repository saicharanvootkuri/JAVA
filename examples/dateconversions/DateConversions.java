package dateconversions;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConversions{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // String to Date
        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String dateString = scanner.nextLine();
        LocalDate localDateFromString = LocalDate.parse(dateString, dateFormatter);
        System.out.println("String to Date: " + localDateFromString);

        // Date to String
        LocalDate currentDate = LocalDate.now();
        String dateToString = currentDate.format(dateFormatter);
        System.out.println("Date to String: " + dateToString);

        // Date Formatting
        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String inputDate = scanner.nextLine();
        LocalDate formattedDate = LocalDate.parse(inputDate, dateFormatter);
        System.out.println("Formatted Date: " + formattedDate.format(dateFormatter));

        // Time Zone Conversions
        System.out.print("Enter a time in UTC format (yyyy-MM-dd HH:mm:ss): ");
        String utcTime = scanner.nextLine();
        LocalDateTime utcDateTime = LocalDateTime.parse(utcTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ZonedDateTime newYorkDateTime = utcDateTime.atZone(ZoneId.of("UTC")).withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("UTC Time: " + utcDateTime);
        System.out.println("New York Time: " + newYorkDateTime);

        // Day of Week
        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String dayOfWeekInput = scanner.nextLine();
        LocalDate dayOfWeekDate = LocalDate.parse(dayOfWeekInput, dateFormatter);
        DayOfWeek dayOfWeek = dayOfWeekDate.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);
        scanner.close();
    }
}
