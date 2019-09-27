import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] arr = new ArrayList[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new ArrayList<Integer>();
		}

		for (int k = 0; k < n; k++) {
			int ele = sc.nextInt();
			for (int l = 0; l < ele; l++) {
				arr[k].add(sc.nextInt());
			}
		}
		int quo = sc.nextInt();
	  for (int j = 0; j < quo; j++) {
			int row = sc.nextInt();
			row -= 1;
			int col = sc.nextInt();
			col-=1;
			try
			{
				System.out.println(arr[row].get(col));
			}
			catch(Exception e)
			{
				  System.out.println("ERROR!");  
			}
			
	}
	}
}
	
		



