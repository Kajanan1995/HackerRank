import java.util.Scanner;

public class LeftRotation {
	public void leftRotation(int arr[], int n) {
		int temp = arr[0], i;
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[i] = temp;

	}

	void printlist(int arr[]) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int rot = scan.nextInt();

		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		LeftRotation lt = new LeftRotation();
		for (int i = 0; i < rot; i++) {
			lt.leftRotation(arr, num);
		}

		lt.printlist(arr);

	}
}
