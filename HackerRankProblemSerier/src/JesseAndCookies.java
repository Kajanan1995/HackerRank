import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAndCookies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		int n = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			que.add(scan.nextInt());
		}

		while (que.peek() < k && que.size() > 2) {

			int a = que.poll();
			int b = que.poll();

			int tot = a * 1 + b * 2;
			que.add(tot);

			count++;

		}

		if (que.peek() < k)

		{
			count = -1;
		}

		System.out.println(count);
	}
}
