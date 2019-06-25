import java.util.Scanner;

public class Minimum_Distances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];

		for (int k = 0; k < len; k++) {
			a[k] = sc.nextInt();
		}

		int sum = 10000;
		int min = 100000;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1 ; j < a.length; j++) 
			{
				if (a[i] == a[j]) {
					sum = Math.abs(i - j);
				}
			}
			if (sum < min) {
				min = sum;
			}
		}
		if(min==0)
			System.out.println(-1);
		else
			System.out.println(min);

	}

}
