import java.util.Scanner;
public class HR2 
             {
public static void finder()
           {
	int num1=0,num2=0,i=0,j=0;
	int arr[]=new int[5];
	int arr1[]=new int[5];
Scanner input=new Scanner(System.in);
	for(i=0;i<3;i++) 
	      {
		arr[i]=input.nextInt();
	         }
	for(j=0;j<3;j++)  {
		arr1[j]=input.nextInt();
                 }
      for(j=0;j<3;j++)     {
          if(arr[j]>arr1[j])
               {
	          num1=num1+1;
                    }
        else if(arr[j]<arr1[j])
                {
	         num2=num2+1;
                  }
             }
 System.out.println(num1+","+num2);
	
            }
public static void main(String [] args)
       {
HR2.finder();
                  }
                }
