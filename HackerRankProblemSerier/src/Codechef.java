import java.io.*;
import java.util.Scanner;

public class Codechef {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 int money=scan.nextInt();
		 double balance=scan.nextDouble();
		 
		 
		 if(money%5==0 && money<=(balance+0.5))
		 {
			 balance=balance-money-0.5;
			 System.out.println(balance);
		 }
		 else
		 {
			 System.out.println(balance);
		 }
		 scan.close();
		 

	}

}
