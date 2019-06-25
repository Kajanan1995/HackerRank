import java.util.Scanner;

public class HR17
         {

	public static void main(String[] args) {
        int[] array = {1,2,3,4,1,23,1,2,1,5,3,3,4,3};

        HR17 obj = new HR17();

        obj.findDupicateInArray(array);
    }

	public void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.print(a[j]);
            count = 0;
        }
    }
            
   

        }
