import java.util.Scanner;

public class Beautiful_Binary_Strings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();

		str = str.replace("010", "");
		int value = (num - str.length()) / 3;
		System.out.println(value);

	}

}
