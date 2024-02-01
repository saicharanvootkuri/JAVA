
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateConversion{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String userInput = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata")); // Set time zone to IST

        try {
            Date date = dateFormat.parse(userInput);

            long unixTimestamp = date.getTime() / 1000;
            System.out.println("Local timestamp (IST) to Unix Timestamp: " + unixTimestamp);//local time --> unix timestamp

            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String utcDateString = dateFormat.format(date);
            System.out.println("Local timestamp (IST) to UTC: " + utcDateString);//local time --> UTC timestamp

            dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
            Date utcDate = dateFormat.parse(utcDateString);
            System.out.println("UTC to Local timestamp (IST): " + dateFormat.format(utcDate));// UTC timestamp --> IST timestamp

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
