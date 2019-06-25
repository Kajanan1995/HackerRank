import java.util.HashMap;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> hs = new HashMap();
		int add = scan.nextInt();
		for (int i = 0; i < add; i++) {
			String str = scan.next();
			if (hs.containsKey(str)) {
				hs.put(str, hs.get(str) + 1);
			} else {
				hs.put(str, 1);
			}
		}
		int que = scan.nextInt();
		int arr[] = new int[que];

		for (int i = 0; i < que; i++) {
			String key = scan.next();
			
			if(hs.containsKey(key))
				arr[i] = hs.get(key);
			else
				arr[i]=0;
		}
		
		for(int j:arr)
		{
			System.out.println(j);
		}

	}

}
