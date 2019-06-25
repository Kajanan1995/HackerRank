import java.util.Scanner;

public class HR1 {
int ucount,sum,uinput;

public void addition()
{
	System.out.println("How Many Element Do You Want To Print");
	Scanner input=new Scanner(System.in);
	ucount=input.nextInt();
	
	for(int i=0;i<ucount;i++)
	{
	uinput=input.nextInt();
	sum=uinput+sum;
	}

 System.out.println("Sum of Array :"+sum);
}

public static void main(String[] args)
{
	HR1 obj=new HR1();
	obj.addition();
}
}