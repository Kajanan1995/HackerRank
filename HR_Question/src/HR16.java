import java.util.Scanner;

public class HR16
{
public static void main(String []args)
      {
	int len=0,sum=0;
	Scanner ip=new Scanner(System.in);
	len=ip.nextInt();
	int pos=ip.nextInt();
	int arr[]=new int[100];
	for(int i=0;i<len;i++)
	     {
	 arr[i]=ip.nextInt();
		
	  }
	int con=ip.nextInt();
	for(int j=0;j<len;j++)
	  {
		sum+=arr[j];
	    }
	int count1=sum/2;
		int count2=(sum-arr[pos])/2;
		int count3=count1-count2;
		
	if(con==count2)
		{
			System.out.println("Bon Appetit");
		}
		else {
    System.out.println(count3);  
      
      }
		System.out.println("\n"+count1);
      }


}

