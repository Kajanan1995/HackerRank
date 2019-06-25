import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<Character> que1 = new LinkedList();

        String str1 = scan.next();
        String str2 = scan.next();
        int value = scan.nextInt();
        for (char ch : str1.toCharArray()) {

            que1.add(ch);
        }
        int count = 0;
try{


        for (char ch1 : str2.toCharArray()) {
            if (que1.peek() == ch1) {
                que1.poll();
                count++;
            } else {
                break;
            }
        }
}
catch(Exception e)
{
 if (value >=(que1.size() + str2.length() - count)  || e.getMessage()=="java.lang.NullPointerException")
            System.out.println("Yes");
        else
            System.out.println("No");
}
       
    }

}
