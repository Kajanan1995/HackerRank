import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int ele = in.nextInt();
		int qu = in.nextInt();
		int arr[] = new int[ele];
		for (int m = 0; m < ele; m++) {
			arr[m] = in.nextInt();
		}
		for (int nu = 0; nu < qu; nu++) {
			int min = 10000;
			int k =in.nextInt();
			int n =in.nextInt();

			for (int i = k; i <= n; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			System.out.println(min);

		}
	}

}