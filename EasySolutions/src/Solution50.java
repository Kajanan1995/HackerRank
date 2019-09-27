import java.util.HashMap;

public class Solution50 {

	public static void main(String[] args) {
      int arr[]= {2,3,4,1,2,4,5,5,2,1,3};
      
      HashMap<Integer,Integer>sh=new HashMap();
      
      for(int a:arr)
      {
    	  if(sh.containsKey(a)==true)
    	  {
    		  sh.put(a,sh.get(a)+1);
    	  }
    	  else
    	  {
    		  sh.put(a,1);
    	  }
      }
      System.out.println(sh);

	}

}
