import java.util.*;
public class Weather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double noon = sc.nextDouble();         
        double evening = sc.nextDouble();      
        double midnight = sc.nextDouble();     
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        sc.close();
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) +"\n");
    }
}