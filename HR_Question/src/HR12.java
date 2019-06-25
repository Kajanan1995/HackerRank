import java.util.Scanner;

 public class HR12 
    {
  public void rat()
        {
	int start1,start2,count=0;
	Scanner input=new Scanner(System.in);
	int arr[]=new int[5];
	int arr1[]=new int[1000];
	int arr2[]=new int[1000];
	for(int i=0;i<4;i++)
	      {
		arr[i]=input.nextInt();
	             }
         arr1[0]=arr[0];
	      arr2[0]=arr[2];
       for(int j=1;j<1000;j++)
             {
	          arr2[j]=arr2[j-1]+arr[3]; 
	          arr1[j]=arr1[j-1]+arr[1]; 
            }
       for(int i=0;i<10;i++)
              {
	    if(arr2[i]==arr1[i])
	           {
	      	count+=1;
	         }
	             }
              if(count >0)
                    {
	          System.out.println("YES");
                 }
                 else
                      {
	            System.out.println("NO");
                       }

                  }
            public static void main(String[] args) 
	           {
	
                HR12 obj=new HR12();
                obj.rat();
	                }

                    }
