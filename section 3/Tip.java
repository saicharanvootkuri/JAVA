import java.util.*;
public class Tip {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bill=sc.nextDouble();
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tipTheWaiter(bill);
        sc.close();
    }
   
    public static void tipTheWaiter(double bill) {

        double tip = bill*0.15;

        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
    }
} 