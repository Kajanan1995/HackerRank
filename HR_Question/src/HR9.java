import java.util.Scanner;

public class HR9 
{
	public int solveMeFirst(int a, int b)

	{return a+b;
        }
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    HR9 obj=new HR9();
    System.out.println(obj.solveMeFirst(a, b));
	}

}
