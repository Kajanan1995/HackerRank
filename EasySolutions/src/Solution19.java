import java.util.Scanner;

public class Solution19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		boolean st = false;
		for (int i = 0; i < arr.length; i++) {
			st = false;
			StringBuilder myName = new StringBuilder(arr[i]);

			for (int j = arr[i].length()-1; j > 0; j--) {
				if (arr[i].charAt(j) > arr[i].charAt(j - 1)) {
					myName.setCharAt(j, arr[i].charAt(j - 1));
					myName.setCharAt(j - 1, arr[i].charAt(j));
					arr[i] = myName.toString();
					st = true;
					break;

				}
			}
			if (st) {
				System.out.println(arr[i]);
			} else {
				System.out.println("no answer");
				;
			}
		}

	}

}
