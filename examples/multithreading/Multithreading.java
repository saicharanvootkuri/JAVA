import java.util.Scanner;

public class Multithreading {

    private static int[] array;
    private static int result = 0;

    public static void main(String[] args) {
        takeArrayInput();

        Thread thread1 = new Thread(() -> calculateSum(0, array.length / 2));
        Thread thread2 = new Thread(() -> calculateSum(array.length / 2, array.length));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalResult = result;
        System.out.println("Sum of the array elements: " + finalResult);
    }

    private static void takeArrayInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static void calculateSum(int start, int end) {
        int partialSum = 0;

        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }

        synchronized (Multithreading.class) {
            result += partialSum;
        }
    }
}
