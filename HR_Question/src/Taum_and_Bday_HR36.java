import java.util.Scanner;

public class Taum_and_Bday_HR36 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		long n = ip.nextLong();

		for (long i = 0; i < n; i++) {
			long b = ip.nextLong();
			long w = ip.nextLong();
			long bc = ip.nextLong();
			long wc = ip.nextLong();
			long z = ip.nextLong();

			long x = Math.min(bc, wc + z);
			long y = Math.min(wc, bc + z);

			long sum = b * x + w * y;
			System.out.println(sum);
		}
	}

}
