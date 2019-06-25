import java.util.ArrayList;
import java.util.Scanner;

public class HR26 {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		Scanner ip = new Scanner(System.in);

		int ele = ip.nextInt();
		int[] arr = new int[ele];
		int count=0;
		int a=0;
		int b=0;
		for (int i = 0; i < ele; i++) {
			arr[i] = ip.nextInt();
		}
	
			
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}

		
		for(int t=0;t<arr.length-1;t++)
		{
		if(Math.abs(arr[t]-arr[t+1])<2)
		{
			System.out.println(arr[t]);
		}
		}
		
		
	}

}
