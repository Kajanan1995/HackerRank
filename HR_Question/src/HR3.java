import java.util.Scanner;

public class HR3 
{
public long addition()
{
	int count=0,i=0;
	long sum=0;
	long arr[]=new long[10000000];
	Scanner input=new Scanner(System.in);
	count=input.nextInt();
	for(i=0;i<count;i++)
	{
		arr[i]=input.nextLong();
		sum=arr[i]+sum;
		
	}

	
	return sum;
}
public static void main(String[]args)
         {
	HR3 obj3=new HR3();
	System.out.println(obj3.addition());
              }
          }
