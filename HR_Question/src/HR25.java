import java.util.Scanner;

public class HR25 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int time = ip.nextInt();
		for (int i = 0; i < time; i++) {

			int a = ip.nextInt();
			int b = ip.nextInt();
			int c = ip.nextInt();
			
			
			if(Math.abs(c-b)<Math.abs(c-a))
			{
				System.out.println("Cat B");
			}
			if(Math.abs(c-b)>Math.abs(c-a))
			{
				System.out.println("Cat A");
			}
			if(Math.abs(c-b)==Math.abs(c-a))
			{
				System.out.println("Mouse C");
			}

		}
	}

}
