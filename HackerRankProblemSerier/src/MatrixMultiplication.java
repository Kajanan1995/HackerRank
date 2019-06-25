import java.util.Scanner;

public class MatrixMultiplication {

	public void findMax(int arr[][]) {
int n=0,m=0;
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		MatrixMultiplication obj = new MatrixMultiplication();
		obj.findMax(arr);

	}

}
