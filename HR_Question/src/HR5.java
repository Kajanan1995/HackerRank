import java.util.Scanner;

public class HR5 
{
     public void check()
                {
	int a=0,count=0,pos=0,neg=0,equal=0;
	double fracpos,fracneg,fragequal;
	int arr[]=new int[100];
    Scanner input=new Scanner(System.in);
     a=input.nextInt();
    for(int i=0;i<a;i++)
         {
	   arr[i]=input.nextInt();
         }
   for(int i=0;i<a;i++)
       {
	   if(arr[i] < 0)
	            {
	    neg+=1;
	    
              }
	   if(arr[i] > 0)
                  {
             pos+=1;
              }
	  if(arr[i]==0)
	        {
	      equal+=1;
	        }
               }
   fracpos=(double)pos/a;
  fracneg=(double)neg/a;
   fragequal=(double)equal/a;
   System.out.printf("%f\n",fracpos);
   System.out.printf("%f\n",fracneg);
   System.out.printf("%f",fragequal);
   
           }
     
     public static void main(String [] args)
     {
        HR5 obj1=new HR5();
         obj1.check();
     }
}
