import java.io.*;
import java.util.*;

public class Ice_Cream_Parlor_HR42 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int times = ip.nextInt();
		for (int m = 0; m < times; m++) {
			int cost = ip.nextInt();
			int flo = ip.nextInt();
			int arr[] = new int[flo];

			for (int k = 0; k < flo; k++) {
				arr[k] = ip.nextInt();
			}
			LinkedHashSet<Integer> mp = new LinkedHashSet<Integer>();

			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] + arr[j] == cost) {
						mp.add(i + 1);
						mp.add(j + 1);
					}
				}
			}

			Iterator itr = mp.iterator();

			while (itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
			System.out.println(" ");
		}
	}
}
