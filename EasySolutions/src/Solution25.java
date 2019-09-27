import java.util.Arrays;
import java.util.Scanner;

public class Solution25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int f=sc.nextInt();
		int arr[]=new int[ele];
		int count=0;
		
		for(int i=0;i<ele;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int num:arr)
		{
			f-=num;
			if(f>0)
			{
		
				count++;
			}
			
		}
		System.out.println(count);

	}

}
