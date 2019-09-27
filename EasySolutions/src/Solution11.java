import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int len = in.nextInt();
		String word = in.next();
		char arr[] = word.toCharArray();
		int rot = in.nextInt();
if(rot>=26)
{
	rot-=26;
}
		
		for (char ch : arr) {

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				int num = ch + rot;
				if (Character.isLowerCase(ch) && num <= 122) {
					System.out.print((char) num);
				}
				if (Character.isLowerCase(ch) && num > 122) {
					num -= 26;
					System.out.print((char) num);
				}
				if (Character.isUpperCase(ch) && num <= 90) {
					System.out.print((char) num);
				}
				if (Character.isUpperCase(ch) && num > 90) {
					num -= 26;
					System.out.print((char) num);
				}
			} else {
				System.out.print(ch);
			}

		}

	}

}
