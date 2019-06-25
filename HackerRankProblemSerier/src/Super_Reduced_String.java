import java.util.Scanner;

public class Super_Reduced_String {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	       StringBuffer wd=new StringBuffer(sc.next());
	       
	       for(int i=1;i<wd.length();i++)
	       {
	    	   if(wd.charAt(i)==wd.charAt(i-1))
	    	   {
	    		   wd.delete(i-1, i+1);
	    		   i=0;
	    	   }
	       }
	       
	       if(wd.length()==0)
	    	   System.out.println("Empty String");
	       else
	    	   System.out.println(wd);
	}
}

