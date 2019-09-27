import java.util.Scanner;

public class ArrayofNegativeSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]= new int[len];
		for(int k=0;k<len;k++)
		{
			arr[k]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				if(sum<0)
					count++;
			}
			System.out.println("");
		}
    	System.out.println(count);

	}

}
