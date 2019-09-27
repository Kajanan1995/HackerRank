import java.util.HashSet;
import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String sen = ip.nextLine();
		sen = sen.toLowerCase();
		sen=sen.replace(" ", "");
		HashSet mp = new HashSet();

		for (char ch : sen.toCharArray()) {
			mp.add(ch);
		}
		if (mp.size() == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}

	}

}
