import java.util.Scanner;

public class Solution20 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		int num = 6;
		String[] arr = new String[num];
		
		for(int l=0;l<num;l++)
		{
			arr[l]=sc.next();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].length() > arr[i + 1].length()) {
				String wd = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = wd;
			}
			if (arr[i].length() == arr[i + 1].length()) {
				if (arr[i].charAt(0) == arr[i + 1].charAt(0)) {
					for (int j = 0; j < arr[i].length(); j++) {
						if (arr[i].charAt(j) > arr[i + 1].charAt(j)) {
							String wd1 = arr[i + 1];
							arr[i + 1] = arr[i];
							arr[i] = wd1;
							break;

						}
					}
				} else {
					if (arr[i].charAt(0) > arr[i + 1].charAt(0)) {
						String wd2 = arr[i + 1];
						arr[i + 1] = arr[i];
						arr[i] = wd2;
						break;
					}

				}
			}
		}
		for(String a:arr)
		{
			System.out.println(a);
		}

	}

}
