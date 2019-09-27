import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int time = ip.nextInt();
		for (int el = 0; el < time; el++) {
			String word = ip.next();
			String sea = "hackerrank";
			char arr[] = word.toCharArray();
			char arr1[] = sea.toCharArray();
			int count = 0;
			int k = 0;

			for (int i = 0; i < arr1.length; i++) {
				for (int j = k; j < arr.length; j++) {
					if(k<word.indexOf(arr[j]))
					{
						k=word.indexOf(arr[j]);
					}
					if (arr[j] == arr1[i]) {
						count++;
						arr[j] = 'z';
						break;
					}

				}
			}
			if (count == 10) {
				System.out.println("YES");
				count = 0;
			} else {
				System.out.println("NO");
				count = 0;
			}

		}
	}
}
