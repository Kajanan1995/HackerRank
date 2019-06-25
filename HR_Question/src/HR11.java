import java.util.Scanner;

public class HR11 {

	public void arrayini()
	{
		int arr[]=new int[60];
		int div=0,b=0,sub=0;
		Scanner input=new Scanner(System.in);
		int count=input.nextInt();
		for(int i=0;i<count;i++)
	      	{
			arr[i]=input.nextInt();
		       }
		
	for(int j=0;j<count;j++)
		 {
	  if(arr[j]>=38)
		   {
			 div=arr[j]%5;
			 if(div>0)
			   {
			 b=(arr[j]/5)+1;
			 sub=((b*5)-arr[j]);
				 
				 if(sub<3)
				 {
				arr[j]=b*5;	 
				 }
				 
				 
			 }
		 }
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		HR11 obj=new HR11();
		obj.arrayini();

	}

}
