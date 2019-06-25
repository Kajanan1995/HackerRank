
public class Missing_Numbers_HR47 {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 2, 3, 4, 5, 6, 3 };
		int arr1[] = { 2, 3, 2, 5, 6,3};
		int l = 0;
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			value = l;
			if (arr1[l] == arr[i]) {
				l++;
			} else {
				for (int k = l; k < arr1.length; k++) {
					if (arr1[l] == arr[i]) {
						l++;
					}
				}
			}
			if (value == l) {
				System.out.println(arr[i]);
			}
		}
	}
}
