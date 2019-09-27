import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String word = in.next();

		int count = 0;
		int val = 0;

		for (char a : word.toCharArray()) {
			if (a == 'U') {
				count++;
			}
			if (a == 'D') {
				count--;
			}
			if (count == 0 && a == 'U') {
				val++;
			}
		}
		System.out.println(val);

	}

}
