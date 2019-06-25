import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Climbing_the_Leaderboard_HR35 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int count = 0;
		HashSet<Integer> li = new HashSet<Integer>();


		for (int i = 0; i < n; i++) {
			li.add(ip.nextInt());
		}
		List<Integer> lt=new ArrayList<Integer>(li);
		int n1 = ip.nextInt();
		int[] arr = new int[n1];
		for (int k = 0; k < n1; k++) {
			arr[k] = ip.nextInt();
		}

		for (int k : arr) {
			count = n-1;
			for (int ele : lt) {
				if (k > ele) {
					count--;
				}
				if(k==ele)
				{
					count=lt.indexOf(k)+2;
				}

			}
			System.out.println(count);
		}
		

	}
}
