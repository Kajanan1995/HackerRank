import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Solution24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Integer> lh = new LinkedHashSet();
		int len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			lh.add(sc.nextInt());
		}
		int lena = sc.nextInt();
		int arr[] = new int[lena];
		for (int j = 0; j < lena; j++) {
			arr[j] = sc.nextInt();
		}

		for (int el : arr) {
			int count = 1;
			Iterator<Integer> It = lh.iterator();
			while (It.hasNext()) {
				if (el < It.next()) {
					count++;
				}
			}
			System.out.println(count);

		}
	}

}