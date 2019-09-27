import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {

	public static void main(String[] args) {

		int num = 5;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lis = new ArrayList();
		String word = "";
		int qua = 5;

		for (int i = 0; i < num; i++) {
			word = "";
			while (sc.hasNext()) {
				word = word + sc.next();

			}
			word = word.replace(" ", "");
			lis.add(word);

		}

		for (int k = 0; k < qua; k++) {
			int ind = sc.nextInt();
			ind-=1;
			int ele = sc.nextInt();
			
		
		
		}

	}
}
