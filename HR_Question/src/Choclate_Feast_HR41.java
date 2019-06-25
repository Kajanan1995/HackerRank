import java.io.*;
import java.util.*;

public class Choclate_Feast_HR41 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int t = ip.nextInt();
		for (int i = 0; i < t; i++) {
			int m = ip.nextInt();

			int c = ip.nextInt();
			int w = ip.nextInt();
			int sum1 = 0;
			int fin = 0;
			int sum = m / c;
			while (sum > 0) {
				fin = fin + sum % w;
				sum1 = sum1 + sum;
				sum = sum / w;

			}
			sum1 = sum1 + fin / w;
			System.out.println(sum1);
		}
	}

}
