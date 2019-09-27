import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		BigInteger b1;

		b1 = new BigInteger(num);

		boolean prime = b1.isProbablePrime(1);
		if (prime == true)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
