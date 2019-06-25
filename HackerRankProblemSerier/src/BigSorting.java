import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int ele = scan.nextInt();
		String arr[] = new String[ele];

		for (int j = 0; j < ele; j++) {
			arr[j] = scan.next();
		}

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return compareString(a, b);
			}
		});
		for (String a : arr) {
			System.out.println(a);
		}
	}

	static int compareString(String s1, String s2) {

		if (s1.length() > s2.length())
			return 1;
		if (s1.length() < s2.length())
			return -1;

		for (int i = 0; i < s1.length(); i++) {
			if ((int) s1.charAt(i) > (int) s2.charAt(2))
				return 1;
			if ((int) s2.charAt(i) > (int) s1.charAt(i))
				return -1;
		}
		return 0;
	}

}
