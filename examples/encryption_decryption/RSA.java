package encryption_decryption;
import java.math.BigInteger;
import java.util.*;
class RSA
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);


    System.out.println("Input message:");
	int msg = sc.nextInt();
	System.out.println("Value of p:");
	int p = sc.nextInt();
	System.out.println("Value of Q:");
	int q = sc.nextInt();
	int n = p * q;
	int phi = (p - 1) * (q - 1);

	int e;
	for (e = 2; e < phi; e++)
	    if (gcd(e, phi) == 1)
		break;

	int d = 1;
	for (int i=0; i<10; i++) {
	    int x = i*phi + 1;
	    if (x % e == 0) {
		d = x / e;
		break;
	    }
	}

	long c = (long)Math.pow(msg, e) % n;

	BigInteger C = BigInteger.valueOf(c);
	BigInteger N = BigInteger.valueOf(n);
	BigInteger D = BigInteger.valueOf(d);
	BigInteger decrypted = C.modPow(D, N);

	System.out.println("Value of Phi: " + phi);
	System.out.println("Value of E: " + e);
	System.out.println("Value of D: " + d);
	
	System.out.println("Encrypted Message: " + c);
	System.out.println("Decrypted message: " + decrypted);
    }

    static int
	gcd(int e, int z)
    {
	if (e == 0)
	    return z;
	else
	    return gcd(z%e, e);
    }}