import java.util.Scanner;

public class Solution32 {

	public long reverse(long x) {
		long tem = 0;
		long val = -1;
		if (x < 0) {
			val = 0;
			x = Math.abs(x);
		}
		while (x > 0) {
			long rev = x % 10;
			tem = tem * 10 + rev;
			x = x / 10;
		}
		if (val == 0) {
			tem = -tem;
		}
		return tem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution32 obj = new Solution32();
		long revs = obj.reverse(sc.nextInt());

		System.out.println(revs);

	}

}
