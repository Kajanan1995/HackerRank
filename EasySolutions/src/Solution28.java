
public class Solution28 {

	public static void main(String[] args) {
		int arr[]= {5,4,4,2,2,8};
		int min=10000000;
		int count=0;
		
		while(true)
		{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>0)
			{
		      if(arr[j]<min)
		      {
		    	  min=arr[j];
		      }
			}
		}
		
		for(int k=0;k<arr.length;k++)
		{
			arr[k]=arr[k]-min;
			
			if(arr[k]>0)
			{
				count++;
			}
		}
		System.out.println(count);
		}
	}

}
