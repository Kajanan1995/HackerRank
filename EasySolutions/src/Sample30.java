
public class Sample30 {

	static void formation(String str1, String str2) {
		int i = 0;
		int val = 0;
		String word = "";
		int value = -1;
		while (i < str1.length()) {
			word = "";
			for (int k = 0; k < str1.length(); k++) {
				val = i + k;
				if (val > str1.length() - 1) {
					val = val - str1.length();
				}
				word = word + str1.charAt(val);
			}
			i++;
			if (word==str2) {
				value = 1;
			}
		
		}
		System.out.println(value);
		
	}

	public static void main(String[] args) {
		formation("abcfg", "cab");

	}

}
