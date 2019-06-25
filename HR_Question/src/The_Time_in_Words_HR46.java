import java.io.*;
import java.util.*;

public class The_Time_in_Words_HR46{

	static void timeword(int h, int m) {
		String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine" };

		if (m == 0) {
			System.out.printf("%s o' clock\n", nums[h]);
		} else if (m == 1) {
			System.out.printf("one minute past %s\n", nums[h]);
		} else if (m == 10) {
			System.out.printf("ten minutes past to %s\n", nums[h]);
		} else if (m == 15) {
			System.out.printf("quater past to %s\n", nums[h]);
		} else if (m == 30) {
			System.out.printf("half past to %s\n", nums[h]);
		} else if (m == 45) {
			System.out.printf("quater to %s\n", nums[h + 1]);
		} else if (m < 30 && m > 1) {
			System.out.printf("%s minutes past %s\n", nums[m], nums[h]);
		} else if (m > 30) {
			System.out.printf("%s minutes to %s\n", nums[60 - m], nums[h + 1]);
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		timeword(ip.nextInt(), ip.nextInt());

	}
}
