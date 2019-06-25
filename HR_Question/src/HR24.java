import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HR24 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int narr1 = 2;
		int narr2 = 2;
		int count = 0, count1 = 0;
		int[] arr1 = new int[narr1];
		int[] arr2 = new int[narr2];
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li1 = new ArrayList<Integer>();
		for (int i = 0; i < narr1; i++) {
			arr1[i] = ip.nextInt();
		}
		for (int i = 0; i < narr2; i++) {
			arr2[i] = ip.nextInt();
		}

		for (int i : arr1) {
			for (int j : arr2) {
				if (j % i == 0) {
					int temp = j / i;
					if (!li.contains(temp)) {
						li.add(temp);
					}
				}

			}

		}

	
		for (int i : li) {
			count = 0;
			for (int k : arr1) {
				if (i % k == 0) {
					count++;
				}
			}
			if (count == arr1.length) {
				System.out.println(i);
			}
		}

	}
}
