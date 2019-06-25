import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		for (int j = 0; j < time; j++) {
			String word = scan.next();

			String str = "";
			int count = 0;

			for (int i = word.length() - 1; i > 0; i--) {
				if (word.charAt(i - 1) < word.charAt(i)) {
					char temp = word.charAt(i);
					char temp1 = word.charAt(i - 1);
					str = word.substring(0, i - 1) + word.charAt(i) + word.charAt(i - 1) + word.substring(i + 1);
					System.out.println(str);
					count++;
					break;

				}
			}
			if (count == 0) {
				System.out.println("no answer");
			}

		}
	}

}
