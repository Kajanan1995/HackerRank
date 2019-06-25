import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Equalize_the_Array_HR33 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		HashSet<Integer> h = new HashSet<Integer>();
		List<Integer> li=new ArrayList<Integer>();
		int arr[] = new int[n];
		int count=0;
		for (int i = 0; i < n; i++) {
			arr[i] = ip.nextInt();
		}
		Arrays.sort(arr);
		for (int j = 0; j < n - 1; j++) {
			if (arr[j] == arr[j + 1]) {
				h.add(arr[j]);
			}
		}
		for(int k:h)
		{count=0;
			for(int i=0;i<n;i++)
			{
				if(k==arr[i])
				{
					count++;
				}
			}
			if(count>0)
			{
			li.add(count);
			}
		}
		if(li.size()>0)
		{
		Collections.sort(li);
		System.out.println(arr.length-li.get(li.size()-1));
		}
		else
		{
			System.out.println(arr.length-1);
		}
		/*for(int el:li)
		{
			System.out.print(el+" ");
		}*/
		//System.out.println(arr.length-count);

	}
}
