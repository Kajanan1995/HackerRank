import java.math.BigInteger;
import java.util.Scanner;

public class HR29ExtraLongFactorial {

	public static void main(String[] args) {

		BigInteger bg = new BigInteger("1");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		for (int i = 1; i <= n; i++) {
			bg = bg.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bg);

	}

}
