import java.math.BigInteger;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String word = ip.nextLine();
		word = word.replaceAll(" ", "");
		System.out.println(word.length());
		double num = Math.sqrt((double) word.length());
		int row = (int) num;
		int column = row + 1;

		char[] arr = word.toCharArray();
		for (int i = 1; i <= arr.length; i++) {
			if (i % column == 0) {
				System.out.print(arr[i - 1]);
				System.out.println("");
			} else {
				System.out.print(arr[i - 1]);
			}

		}

	}

}
