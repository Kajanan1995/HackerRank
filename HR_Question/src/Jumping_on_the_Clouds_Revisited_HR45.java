import java.io.*;
import java.util.*;

public class Jumping_on_the_Clouds_Revisited_HR45 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int ele = ip.nextInt();
		int k = ip.nextInt();
		int arr[] = new int[ele];

		for (int j = 0; j < ele; j++) {
			arr[j] = ip.nextInt();
		}
		int energy = 100;

		for (int i = k; i < arr.length; i = i + k) {

			if (arr[i] == 1) {
				energy -= 3;

			}
			if (arr[i] == 0) {
				energy -= 1;
			}

		}

		if (arr[0] == 1) {
			energy -= 3;
		}
		if (arr[0] == 0) {
			energy -= 1;
		}
		System.out.println(energy);
	}
}
