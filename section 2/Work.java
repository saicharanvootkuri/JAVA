import java.util.*;
public class Work{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        boolean holiday = true;
        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
        sc.close();

    }
}