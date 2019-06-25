import java.util.Scanner;

public class HR8 {

	
	public void candles()
	 {
		long arr[]=new long[100000],max=0,count=0;
		Scanner input=new Scanner(System.in);
		int len=input.nextInt();
		
		for(int i=0;i<len;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
	     for(int i=0;i<len;i++)
		 {
			if(arr[i]==max)
			{
				count+=1;
			}
		 }
		System.out.println(count);
	 }
	public static void main(String[] args) {
		
		HR8 obj1=new HR8();
		obj1.candles();

	}

}
