import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HappyLadyBugs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int time=sc.nextInt();
		for(int h=0;h<time;h++)
		{
		int num = sc.nextInt();
		String word = sc.next();
		word = word.replace("_", "");
		int count = 1;

		char arr[] = new char[word.length()];
		int i = 0;
		for (char ar : word.toCharArray()) {
			arr[i] = ar;
			i++;
		}

		HashMap<Character, Integer> ht = new HashMap();

		Arrays.sort(arr);
		for (int j = 0; j < word.length(); j++) {

			if (ht.containsKey(arr[j])) {
				ht.put(arr[j], ht.get(arr[j]) + 1);
			} else {
				ht.put(arr[j], 1);
			}
		}
		Set entrySet = ht.entrySet();
		Iterator it = entrySet.iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			if ((int) me.getValue() < 2) {
				count = 0;
				break;
			}
		}
		if (count == 1)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	}
}
