import java.util.Scanner;

public class HR22 {


		public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			int st=scan.nextInt();
			int end=scan.nextInt();
			int deno=scan.nextInt();
			int temp=0,numb=0,count=0;
			for(int i=st;i<=end;i++)
			{
				numb=0;
				temp=i;
				while(temp!=0)
				{
		     int div=temp%10;
		        numb=numb*10+div;
		        temp=temp/10;
				}
				int divisible=Math.abs(numb-i);
			      double ans=(double)divisible/deno;
	 if(ans==Math.round(ans))
	 {
	       count++;
			}
			}

			}

		}


