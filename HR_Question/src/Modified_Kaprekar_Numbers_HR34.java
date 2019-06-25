import java.util.Scanner;

public class Modified_Kaprekar_Numbers_HR34 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		long num1 = ip.nextInt();
		long num2 = ip.nextInt();
		long temp = 0;
		long div = 0, div1 = 0, count = 0;

		for (long i = num1; i <= num2; i++) {
			temp = 0;
			long k = i * i;
			String word = String.valueOf(i);
			div = word.length();
			div1 = (long) Math.pow(10, div);
			while (k > 0) {
				temp = temp + k % div1;
				k = k / div1;
			}

			if (temp == i) {
				System.out.print(i + " ");
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("INVALID RANGE");
		}

	}

}
