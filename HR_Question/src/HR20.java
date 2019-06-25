import java.util.Scanner;

public class HR20 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int elements = ip.nextInt();
		int arr[] = new int[elements];
		int zum = 0, count = 0;
		for (int j = 0; j < elements; j++) {
			arr[j] = ip.nextInt();
		}
		int sum = ip.nextInt();
		int ele = ip.nextInt();
		if (elements - ele > 0) {
			for (int i = 0; i <= elements - ele; i++) {
				zum = 0;
				for (int k = 0; k < ele; k++) {
					zum = zum + arr[i + k];
				}
				if (zum == sum) {
					count++;
				}

			}
		}
		if (elements - ele == 0) {
			for (int l : arr) {
				zum = zum + l;
				if (zum == sum) {
					count++;
				}
			}

		}
		System.out.println(count);

	}

}
