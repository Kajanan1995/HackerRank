import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
int time=in.nextInt(); 

for(int el=0;el<time;el++)
{
	
		String word = in.next();
		String sea = "hackerrank";
		char arr[] = word.toCharArray();
		int count = 0;

		for (char a : sea.toCharArray()) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == a) {
					arr[i] = 'z';
					i++;
					count++;
					break;
				}
			}
		}
		if (count == 10) {
			System.out.println("YES");
			count=0;
		} else {
			System.out.println("NO");
			count=0;
		}
	}
	}
}
