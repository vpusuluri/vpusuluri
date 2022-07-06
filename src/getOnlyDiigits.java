
public class getOnlyDiigits {

	public static void main(String[] args) 
	{
		String str = "How is 345 this is number 4565 &^%$";
		int len = str.length();
		String num="";
		System.out.println("The String lenght = " + len);
		for(int i=0;i<len;i++)
		{
			char c = str.charAt(i);
			//System.out.println("The Character Read is= " + c);
			if(Character.isDigit(c))
			{
				 //System.out.println(" The Character " + c + " is a Digit ");
				 num = num + c;
			}
			
			
		}
		System.out.println("The Digits are = " + num);

	}

}
