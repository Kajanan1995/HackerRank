import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Find_Median_HR32 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String word = ip.nextLine();
		long n = ip.nextLong();
		char arr[] = word.toCharArray();
		long wd = n % word.length();
		long wd1 = n / word.length();

		int count = 0, count1 = 0;

		for (char ch : arr) {
			if (ch == 'a') {
				count++;
			}
		}
		if (wd > 0) {
			for (int i = 0; i < wd; i++) {
				if (arr[i] == 'a') {
					count1++;
				}
			}
		}

		long total = (long) count * wd1 + (long) count1;
		System.out.println(total);
	}
}
