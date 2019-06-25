import java.util.HashMap;
import java.util.Scanner;

public class Contacts {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		HashMap<String, Integer> sh = new HashMap();
		for (int i = 0; i < time; i++) {
			String word = scan.next();

			if (word == "add") {
				String str = scan.next();
				if (sh.containsKey(str)) {
					sh.put(str, sh.get(str) + 1);
				} else {
					sh.put(str, 1);
				}
			} else {
				String str1 = scan.next();
				if (sh.containsKey(str1))
					System.out.println(sh.get(str1));
				else
					System.out.println(0);

			}

		}

	}

}
