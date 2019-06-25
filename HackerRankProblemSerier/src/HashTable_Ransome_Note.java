import java.util.HashMap;
import java.util.Scanner;

public class HashTable_Ransome_Note {
	public void dictionary() {
		int count = 0;
		HashMap<String, Integer> mp = new HashMap();
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		int len2 = sc.nextInt();

		for (int i = 0; i < len1; i++) {
			String key = sc.next();
			if (mp.containsKey(key)) {
				mp.put(key, mp.get(key) + 1);
			} else {
				mp.put(key, 1);
			}
		}
		for (int j = 0; j < len2; j++) {
			String str = sc.next();
			if (mp.containsKey(str) == false) {
				System.out.println("No");
				return;
			} else {
				if (mp.get(str) > 0) {
					mp.put(str, mp.get(str) - 1);
					count++;
				} else {
					mp.remove(str);
				}
			}

		}
		if (count == len2 && len2 <= len1)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	public static void main(String[] args) {
		HashTable_Ransome_Note ht = new HashTable_Ransome_Note();
		ht.dictionary();

	}

}
