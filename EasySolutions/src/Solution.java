import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = 100000;
		int count = 2;
		int stop = 1;
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		while (count > 1) {
			count = 0;
			for (int k : arr) {

				if (k > 0) {
					if (k < min) {
						min = k;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {

					arr[i] = arr[i] - min;

				}
				if (arr[i] > 0) {
					System.out.print(arr[i]);

				}
			}
			/*if (count > 0) {

				System.out.println(count);
			}*/

		}
	}
}
