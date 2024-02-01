import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String username = sc.nextLine();
        String password = sc.nextLine();

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameEntry = scan.nextLine();
        System.out.print("- Password: ");
        String passwordEntry = scan.nextLine();
        sc.close();

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");

        scan.close();

        
    }
}
