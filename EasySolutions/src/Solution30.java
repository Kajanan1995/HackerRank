import java.util.Arrays;
import java.util.Scanner;

public class Solution30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int count=0;
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length-2;i++)
		{
			
			if(arr[i]==0 && arr[i+1]==0)
			{
				if(arr[i+2]!=1)
				{
					count++;
					i=i+1;
				}
			
			}
			if(arr[i]!=1)
			{
				count++;
			}
			
		}
		

	}

}
