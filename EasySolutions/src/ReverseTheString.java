import java.util.Arrays;

public class ReverseTheString {

	public static void main(String[] args) {
		String str = "kajanan";
		char arr[] = str.toCharArray();
		int last = str.length() - 1, first = 0;

		StringBuffer str1 = new StringBuffer("kajanan");

		// StringBuilder and StringBuffer itself contain the inbuild functions to
		// reverse the string Easy to use if u want it

		while (first < str.length() / 2) {
			// first method using Sting Buffer
			char tmp = str1.charAt(last);
			str1.setCharAt(last, str1.charAt(first));
			str1.setCharAt(first, tmp);
			// Method using Char array
			char temp = arr[last];
			arr[last] = arr[first];
			arr[first] = temp;
			last--;
			first++;

		}

		str = String.copyValueOf(arr);
		System.out.println(str);

		System.out.println(str1);
	}

}
