import java.util.Scanner;

public class Alternative_Characters {

	public void operations() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();

		for (int j = 0; j < num; j++) {
			count = 0;
			String word = sc.next();

			for (int k = 0; k < word.length() - 1; k++) {

				if (word.charAt(k) == word.charAt(k + 1)) {
					count++;
				}

			}
			System.out.println(count);
		}

	}

	public static void main(String[] args) {
		Alternative_Characters obj = new Alternative_Characters();
		obj.operations();

	}

}
