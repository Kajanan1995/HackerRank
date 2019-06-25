	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class HR21 {
		public static void main(String[] args) {

			Scanner ip=new Scanner(System.in);
			int len = ip.nextInt();
			int arr[]=new int[len];
			for(int m=0;m<len;m++)
			{
			arr[m] =ip.nextInt();
			}
			int count =0;
			int div = 0;
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < len; i++) {
				set.add(arr[i]);
			}

			for (int a : set) {
				count = 0;
				for (int i = 0; i < len; i++) {
					if (arr[i] == a) {
						count++;
					}

				}
				div = div + count / 2;
			}
			System.out.println(div);

		}
	}

