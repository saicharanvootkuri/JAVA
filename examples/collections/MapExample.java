package collections;

import java.util.HashMap;
import java.util.Map;
public class MapExample{
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("sai", "1234567890");
        phoneBook.put("charan", "0987654321");
        phoneBook.put("bunty", "2345678901");

        System.out.println("Original Phone Book:");
        printPhoneBook(phoneBook);

        String charanPhoneNumber = phoneBook.get("charan");
        System.out.println("\ncharan's Phone Number: " + charanPhoneNumber);

        String ladduPhoneNumber = phoneBook.get("laddu");
        if (ladduPhoneNumber != null) {
            System.out.println("laddu's Phone Number: " + ladduPhoneNumber);
        } else {
            System.out.println("laddu is not in the phone book.");
        }

        phoneBook.remove("bunty");
        System.out.println("\nModified Phone Book:");
        printPhoneBook(phoneBook);
    }
    private static void printPhoneBook(Map<String, String> phoneBook) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
