import java.util.HashSet;
import java.util.Scanner;

public class Solution16 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int time = ip.nextInt();
		for (int i = 0; i < time; i++) {
			String str1 = ip.next();
			HashSet sh = new HashSet();
			for (char ch : str1.toCharArray()) {
				sh.add(ch);
			}
			System.out.println(sh.size());

		}
	}

}
