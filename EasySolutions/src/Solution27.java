
public class Solution27 {
	public static int work(int min,int arr[])
	{
		int count=0;
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
		
		
		
		return work(min, arr);
	}

	public static void main(String[] args) {
		int arr[]= {5,4,4,2,2,8};
		int min=10000000;
		
		int ans= work(min,arr);
		System.out.println(ans);

		
		

	}

}
