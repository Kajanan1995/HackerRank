import java.util.Scanner;

public class Solution12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String wd = in.next().toUpperCase();
		
		char arr[]=wd.toCharArray();
		char sc[]= {'S','O','S'};
		int k=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			 if(k>2)
			 {
				 k=0;
			 }
			 if(arr[i]==sc[k])
			 { 
				 k++;
				
			 }
			 else
			 {
				 k++;
				 count++;
			 }
			 

			 
		}
		System.out.println(count);
	}
}
		
	
	
