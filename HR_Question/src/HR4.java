import java.util.Scanner;

public class HR4 
{
public void matrix()
         {
	int square=0,sum1=0,sum2=0,dig=0;
    int arr[][]=new int[10][10];
	Scanner input=new Scanner(System.in);
    square=input.nextInt();
    dig=square-1;
    for(int i=0;i<square;i++)
     {
    	for(int j=0;j<square;j++)
    	 {
    		arr[i][j]=input.nextInt();
    	 }
     }
	
    for(int i=0;i<square;i++)
    {
    	
    	for(int j=0;j<square;j++)
    	{
    		if(i==j)
    		{
    	 sum1=sum1+arr[i][j];
    		}
    		
    	}
    	sum2=sum2+arr[i][dig];
    	dig=dig-1;
    			
    	
    	}
    int x=Math.abs(sum2-sum1);
    System.out.println(x);

}
public static void main(String[] args)
{
	HR4 obj=new HR4();
	obj.matrix();
}
}
