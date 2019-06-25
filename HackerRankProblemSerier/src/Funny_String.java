import java.util.ArrayList;
import java.util.Scanner;

public class Funny_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nume = scan.nextInt();
		for (int j = 0; j < nume; j++) {
			String str = scan.next();
			int num = 0;

			String adj = "";
			String rev = "";
			StringBuilder word = new StringBuilder(str);
			ArrayList<Integer> lt = new ArrayList();
			ArrayList<Integer> ltrev = new ArrayList();

			String revstr = word.reverse().toString();

			for (int i = 0; i < str.length() - 1; i++) {
				num = Math.abs(str.charAt(i + 1) - str.charAt(i));
				lt.add(num);
			}

			for (int i = str.length() - 1; i > 0; i--) {
				num = Math.abs(str.charAt(i - 1) - str.charAt(i));
				ltrev.add(num);
			}

			if (lt.equals(ltrev))
				System.out.println("Funny");
			else
				System.out.println("Not Funny");

		}
	}
}
