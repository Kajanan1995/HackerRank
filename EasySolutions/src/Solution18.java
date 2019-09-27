import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution18 {

    static int solve(String opr) {
        
    int rec=0;
    rec=Integer.parseInt(Character.toString(opr.charAt(0)));
    
//       if(opr.charAt(1)=='+')
//       {
//          rec= Integer.valueOf(opr.charAt(0))+Integer.valueOf(opr.charAt(2));
//       }
//         if(opr.charAt(1)=='-')
//       {
//           rec= Integer.valueOf(opr.charAt(0))-Integer.valueOf(opr.charAt(2));
//       }
 return rec;
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}