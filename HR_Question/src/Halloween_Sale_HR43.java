import java.io.*;
import java.util.*;

public class Halloween_Sale_HR43 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int p = ip.nextInt();
		int d = ip.nextInt();
		int m = ip.nextInt();
		int s = ip.nextInt();
		int sum = 0;
		int count = 0;

		if (s > p) {
			for (int i = p; i > m; i = i - d)

			{
				sum = i + sum;
				if (sum <= s) {
					count++;

				}

			}
			p = m;
			while (sum <= s) {
				sum = sum + m;
				if (sum <= s) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
