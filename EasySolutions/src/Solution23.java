import java.util.Arrays;

public class Solution23 {

	public static void main(String[] args) {
		int arr[] = { 1,2,2,3,1,2};

		Arrays.sort(arr);
		int k = 0;
		int count = 0;
		int max = 0;
		while (k < arr.length) {
			count=0;
			for (int i = 0; i < arr.length; i++) {
				if (Math.abs(arr[k] - arr[i]) <= 1) {

					count++;
				}

			}
			if (count > max) {
				max = count;
			}
			k++;
		}
		System.out.println(max);
	}

}
