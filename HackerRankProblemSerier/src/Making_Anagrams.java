
public class Making_Anagrams
{
	public static void main(String[] args)
	{
		String str1="cdec";
		String str2="abcc";
		
	StringBuilder bul=new StringBuilder(str1);
		
	for(char ch:str2.toCharArray())
	{
		String st=Character.toString(ch);
		int val=bul.indexOf(st);
		if(val>0)
		{
			bul.deleteCharAt(val);
		}
	}
     	System.out.println(bul);

	}

}
