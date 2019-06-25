import java.io.*;
import java.util.*;

public class Beautiful_Triplets_HR37 {

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int n, d, count =0;
        n = sc.nextInt();
        d = sc.nextInt();
        int[] c = new int[n];
         for(int c_i=0; c_i < n; c_i++){
            c[c_i] = sc.nextInt();
        }
        
        Arrays.sort(c);
        
         for(int c_i=0; c_i < n; c_i++){
             for(int i = c_i+1; i<n; i++)
                if((c[i] - c[c_i]) == d)
                {
                    for(int j = i+1; j<n; j++)
                        if(c[j]-c[i] ==d )
                            count++;
                 //System.out.println(c[i]+"          "+c[c_i]);
                    break;
                }
        }
        System.out.println(count);
    }
}