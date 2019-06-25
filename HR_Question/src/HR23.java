
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HR23 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int ele = ip.nextInt();
		List<Integer> ad = new ArrayList<Integer>();

		for (int i = 0; i < ele; i++) {
			ad.add(i, ip.nextInt());

		}
		int time = ip.nextInt();
		String word[] = new String[time];
		for (int i = 0; i < time; i++) {

			word[i] = ip.next();
			if (word[i].compareTo("Insert") == 0) {
				ad.add(ip.nextInt(), ip.nextInt());
				// System.out.println(time);
			}
			if (word[i].compareTo("Delete") == 0) {
				ad.remove(ip.nextInt());

			}
		}

		System.out.println("");
		for (int k : ad) {
			System.out.print(k + " ");
		}

	}
}
