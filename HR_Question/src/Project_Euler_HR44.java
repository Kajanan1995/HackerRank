import java.math.BigInteger;
import java.util.Scanner;

public class Project_Euler_HR44 {
	public static void main(String[] args) throws NullPointerException {

		Scanner ip = new Scanner(System.in);
		int time = ip.nextInt();
		BigInteger[] num = new BigInteger[time];

		BigInteger sum = new BigInteger("0");

		for (int i = 0; i < time; i++) {
			num[i] = ip.nextBigInteger();
		}
		for (int i = 0; i < num.length; i++) {
			sum = sum.add(num[i]);
		}
		String numb = sum.toString();
		System.out.println(numb.substring(0, 10));
	}
}
