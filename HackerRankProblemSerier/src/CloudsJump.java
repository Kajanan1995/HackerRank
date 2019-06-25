import java.util.Scanner;

public class CloudsJump {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ele = sc.nextInt();
		int arr[] = new int[ele];
		int count = 0;
		for (int i = 0; i < ele; i++) {
			arr[i] = sc.nextInt();
		}
		int i = 0;
		while (i < ele - 2) {
			if (arr[i + 2] != 1) {
				i += 2;
				count++;
			} else {
				i += 1;
				count++;
			}

		}
		if (i == ele - 1) {
			System.out.println(count);
		} else {
			System.out.println(count + 1);
		}

	}

}
