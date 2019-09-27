import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String sen = in.next();
		int count=0;
		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (Character.isUpperCase(ch)) {
              count++;
			}
		}
		char first=sen.charAt(0);
		if(Character.isUpperCase(first))
		{
			System.out.println(count);
		}
		if(Character.isLowerCase(first))
		{
			System.out.println(count+1);
		}
	}

}
