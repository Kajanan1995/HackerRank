import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HR28 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		List li = new ArrayList();

		int n = ip.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			li.add(ip.nextInt());
		}

		for (int i = 1; i <= n; i++) {
			arr[i - 1] = li.indexOf(i) + 1;
		}
		for (int a : arr) {

			System.out.print(li.indexOf(a) + 1);
		}
	}

}
