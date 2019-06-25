
public class BinaryToDecimal {

	public void bTd(String bt)
	{
		int j=0;
		int i=bt.length()-1;
		long tot=0;
		while(i>=0)
		{
			long value=Character.getNumericValue(bt.charAt(i));
			
			tot=(long) (value*(Math.pow(2,j)))+tot;
			j++;
			i--;
		}
		System.out.println(tot);
	}
	
	
	
	public static void main(String[] args) {
		BinaryToDecimal obj=new BinaryToDecimal();
		obj.bTd("10001");

	}

}
