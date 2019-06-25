import java.util.Scanner;
import java.math.*;
public class HR19 
     { 
	public static void solution()
	                  {
		Scanner ip=new Scanner(System.in);
		
		int a=ip.nextInt();
		int b=ip.nextInt();
		int time=ip.nextInt();
		int ans=a;
		for(int j=0;j<time;j++)
		{
	   ans=(int) (ans+Math.pow(2, j)*b);	
	 System.out.print(ans+" ");
	            }
	System.out.println(" ");
	
	                           }
	                  
	public static void main(String []args)
	{
		Scanner ip=new Scanner(System.in);
		int t=ip.nextInt();
		for(int i=0;i<t;i++)
         {
		HR19.solution();
          }
                           }
	                  }
                           
     


















   /*  {
	static void solutions()
       	{
		Scanner ip=new Scanner(System.in);
	int a=ip.nextInt();
	int b=ip.nextInt();
	int t=ip.nextInt();
	
int ans=a; 
for(int i=1;i<t;i++)
{                                                        
       ans=(int) (Math.pow(2, i)*b+ans);
       int sum=ans;
       System.out.println(sum);
	    }
       	}
	public static void main(String[] args) 
	{

		HR19 .solutions();
	}

}
*/