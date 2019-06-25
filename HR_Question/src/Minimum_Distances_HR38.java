import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Minimum_Distances_HR38 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> st = new LinkedHashSet<Integer>();
		Scanner ip = new Scanner(System.in);
		int ne = ip.nextInt();
		int arr[] = new int[ne];
		for (int el = 0; el < ne; el++) {
			arr[el] = ip.nextInt();
		}

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[j] == arr[i]) {
					st.add(i);
					st.add(j);
				}
			}
		}
		if (st.size() > 0) {
			int[] arr1 = new int[st.size()];
			int l = 0;
			if (st.size() > 0) {
				Iterator<Integer> it = st.iterator();

				while (it.hasNext()) {
					arr1[l] = it.next();
					l++;
				}

			}

			int sum = Math.abs(arr1[0] - arr1[1]);
			if (ne % 2 != 0) {
				for (int i = 0; i < arr1.length - 1; i = i + 2) {
					if (Math.abs(arr1[i] - arr1[i + 1]) < sum) {
						sum = (Math.abs(arr1[i] - arr1[i + 1]));
					}

				}
			}
			if (ne % 2 == 0) {
				for (int i = 1; i < arr1.length; i = i + 2) {
					if (Math.abs(arr1[i] - arr1[i - 1]) < sum) {
						sum = (Math.abs(arr1[i] - arr1[i - 1]));
					}

				}
			}
			System.out.println(sum);
		} else {
			System.out.println(-1);
		}

	}

}
