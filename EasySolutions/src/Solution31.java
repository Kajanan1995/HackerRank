import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Solution31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long k = sc.nextLong();
		int count = 0;
		ArrayList<Long> lt = new ArrayList();

		for (int i = 0; i < num; i++) {
			lt.add(sc.nextLong());
		}
		
		Iterator<Long> it=lt.iterator();
		Collections.sort(lt);
		for (long val : lt) {
			k -= val;
			if (k >= 0) {
				count++;
			}

		}
		System.out.println(count);

	}
}
