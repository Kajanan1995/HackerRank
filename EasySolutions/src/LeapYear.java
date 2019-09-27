import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  word = "a-a-a-a";
		int count=0;
		String str1="";
		String str2="";
                  
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='-')
			{
				str1=str1.concat("-");
			}
			else
			{
				str2=str2+word.charAt(i);
			}
		}
		word=str1+str2;
		System.out.println(word);
		
		
	}

}


