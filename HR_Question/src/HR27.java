import java.util.Scanner;

public class HR27 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		int page1 = ip.nextInt();
		int page2 = ip.nextInt();
		int count = 0;
		int count1 = 0;

		for (int i = 1; i <= page2; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}

		for (int i = page1 - 1; i >= page2; i--) {
			if (i % 2 != 0) {
				count1++;
			}
		}

		if (page1 - page2 == 0) {
			System.out.println(0);
		} else {
			if (count >= count1) {
				System.out.println(count1);
			} else {
				System.out.println(count);
			}
		}

	}

}
