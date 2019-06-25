import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HR10 
{
	
		   public static void main(String [] args) throws Exception {
		       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
		       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		       Scanner input=new Scanner(System.in);
		       Date date = parseFormat.parse(input.nextLine());
		       System.out.println(displayFormat.format(date));
	}

}
