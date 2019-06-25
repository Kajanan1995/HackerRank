import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HR13 
 {
public static void insertion()
         {
	int arr1[]=new int[10];
	int arr2[]=new int[10];
	int div=0;
	   Set<Integer> hash_Set = new HashSet<Integer>(); 
	   
	Scanner ip=new Scanner(System.in);
   int ele1=ip.nextInt();
   int ele2=ip.nextInt();

    for(int i=0;i<ele1;i++)
           {
	    arr1[i]=ip.nextInt();
               }
    
    for(int i=0;i<ele2;i++)
             {
         arr2[i]=ip.nextInt();
                     }
         

for(int i=0;i<ele1;i++)
           {
	for(int j=0;j<ele2;j++)
	          {
		div=arr2[j]/arr1[i];
		hash_Set.add(div);
		
	        }
         }
         }

	public static void main(String[] args) 
	   {
 

	      }

}
