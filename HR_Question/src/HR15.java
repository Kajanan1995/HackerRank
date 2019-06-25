import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HR15 
{
public static void insertion()
      {
	Scanner ip=new Scanner(System.in);
	int count=0,val=0;
	int len=ip.nextInt();
	int arr[]=new int[10];
	int arr1[]= {1,2,3,4,5};
	   Map<Integer, Integer> numberMapping = new HashMap<>();
	
	for(int i=0;i<len;i++)
	        {
	arr[i]=ip.nextInt();
	             }
for(int k:arr1)
{
	count=0;
	for(int j=0;j<len;j++)
	{
	if(arr[j]==k)
	{
		count+=1;
	}
	numberMapping.put(k, count);
	
	   }
     	}
for(int i=1;i<=len;i++)
      {
	val=numberMapping.get(i);
	System.out.println(val);
         }
    System.out.println(numberMapping);
      }


public static void main(String[] args) 
	        {
 
             HR15.insertion();
               	}

}
