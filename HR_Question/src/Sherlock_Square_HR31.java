import java.util.Scanner;

public class Sherlock_Square_HR31 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int t = ip.nextInt();

		for (int j = 0; j < t; j++) {
			int a = ip.nextInt();
			int b = ip.nextInt();

			int k = (int) Math.sqrt(a);
			int l = (int) Math.sqrt(b);
			int count = 0;

			for (int i = k; i <= l; i++) {
				int temp = i * i;
				if (a <= temp && temp <= b) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
