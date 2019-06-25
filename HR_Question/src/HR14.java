import java.util.Scanner;

public class HR14 
     {

 public static void summing()
     {
	Scanner input=new Scanner(System.in);
	int arr[]=new int[100];
	int num=input.nextInt();
	int div=input.nextInt();
	
	int k=0,sum=0,count=0;
	
	
	  for(int i=0;i<num;i++)
	        {
		arr[i]=input.nextInt();
	            }
	
	for(int i=0;i<num;i++)
	{
		for(int j=i+1;j<num;j++)
		{
			sum=arr[i]+arr[j];
			
			k=sum%div;
			if(k==0)
			{
				count+=1;
			}
		}
	}
	 System.out.println(count);
     }
	
	
	
	public static void main(String[] args) 
	{
 HR14.summing();

	}

}
