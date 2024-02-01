package encoding__decoding;

import java.util.Base64;
import java.util.Scanner;

public class BasicBase64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Base64.Encoder encoder = Base64.getEncoder();

        System.out.println("Enter a string to encode: ");
        String inputString = scanner.nextLine();

        String str = encoder.encodeToString(inputString.getBytes());
        System.out.println("Encoded string: " + str);

        Base64.Decoder decoder = Base64.getDecoder();

        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: " + dStr);
        scanner.close();
    }
}
