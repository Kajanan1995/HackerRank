import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Problem {

	public static void main(String[] args) {

		HashSet<String> st = new HashSet();
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		for (int i = 0; i < time; i++) {
			String word = sc.nextLine();
			st.add(word);
			System.out.println(st.size());
			
			String string=sc.nextLine();

		}

	}
}
