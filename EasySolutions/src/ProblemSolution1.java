import java.util.Scanner;
import java.util.regex.Pattern;

public class ProblemSolution1 {
	int arr[]= {1,2,3,4,5};
	
	void swap(int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	void arrayReverse()
	{
		int front=0;
		int back=arr.length-1;
		
		while(front<back)
		{
			swap(front,back);
			front++;
			back--;
		}
	}
		void printArray()
		{
			for(int k:arr)
			{
				System.out.println(k);
			}
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ProblemSolution1 obj=new ProblemSolution1();
		obj.arrayReverse();
		obj.printArray();
			
			
			
			
		
	}
}