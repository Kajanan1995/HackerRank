
import java.util.*;

public class GameStoneProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String arr[] = new String[num];

		HashSet<String> ls = new HashSet();

		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		int count = 0;
		int top = 100;
		String list = "";

		String word1 = arr[0];
		String word2 = arr[1];

		for (char a : word2.toCharArray()) {
			if (word1.contains(Character.toString(a))) {
				ls.add(Character.toString(a));
			}
		}
		for (String a : ls) {
			list += a;
		}

		for (String word : arr) {
			for (String key : ls) {
				if (word.contains(key) == false) {

					list = list.replace(key, "");
				}
			}
		}
		System.out.println(list.length());

	}
}
