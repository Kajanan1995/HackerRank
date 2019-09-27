import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> st = new ArrayList();
		int num = sc.nextInt();

		String arr[] = new String[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		int num1 = sc.nextInt();
		for (int k = 0; k < num1; k++) {
			st.add(sc.next());
		}

		for (String rem : arr) {
			st.remove(rem);
		}
		for (String element : st) {
			System.out.print(element + " ");
		}

	}
}