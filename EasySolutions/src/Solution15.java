import java.util.Scanner;

public class Solution15 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int time=sc.nextInt();
for(int i=0;i<time;i++)
{
		String str1=sc.next();
		String str2=sc.next();
		String alha="abcdefghijklmnopqrstuvwxyz";
		String ans="NO";
		
	     for(char ch:alha.toCharArray())
	     {
	    	 if(str2.contains(Character.toString(ch)) && str1.contains(Character.toString(ch)))
	    	 {
	    		 ans="YES";
	    	 }
	     }
		
System.out.println(ans);
	}
	}

}
