import java.util.Scanner;

public class HR7 {
	
	public void minmax()
	 {
		long temp1=0,temp2,sum=0;
		long arr[]=new long[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<5;i++)
		 {
			arr[i]=input.nextLong();
		 }
           temp2=arr[0];
		for(int i=0;i<5;i++)
		{
			
		if(arr[i]>=temp1)
			{
			temp1=arr[i];
			}
		if(arr[i]<=temp2)
			{
			temp2=arr[i];
			}
		sum=arr[i]+sum;
		}
		System.out.print(sum-temp1);
		System.out.print(" ");
		System.out.println(sum-temp2);
		
	}
	
	public static void main(String[] args) {

HR7 obj2=new HR7();
obj2.minmax();

	}

}
