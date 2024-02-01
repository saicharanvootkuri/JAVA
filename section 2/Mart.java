import java.util.*;
public class Mart {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Amount in the wallet:");
        double wallet=sc.nextInt(); 
        System.out.println("Cost of toycar:");
        double toyCar = sc.nextDouble();
        System.out.println("Can I get this car?");
        if (wallet >= toyCar) {
            System.out.println("Sure!\n");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }
        System.out.println("cost of shoes:");
        double nike = sc.nextDouble(); 
        System.out.println("Can I get these nike shoes?");
        if (wallet >= nike) {
            System.out.println("Sure!\n");
            wallet -= nike;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }
        sc.close();

    }
}
