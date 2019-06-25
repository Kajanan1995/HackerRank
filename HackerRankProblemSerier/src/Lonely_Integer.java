import java.util.HashMap;
import java.util.Scanner;

public class Lonely_Integer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ans = 0;

		HashMap<Integer, Integer> set = new HashMap();
		for (int i = 0; i < num; i++) {
			int num1 = scan.nextInt();
			if (set.containsKey(num1)) {
				set.put(num1, set.get(num1) + 1);
			} else {
				set.put(num1, 1);
			}

		}

		for (Integer i : set.keySet()) {
			int value = set.get(i);
			if (value == 1) {
				ans = i;
			}
		}
		System.out.println(ans);

	}

}
