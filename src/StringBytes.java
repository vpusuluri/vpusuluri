import java.util.Arrays;

public class StringBytes 
{

	public static void main(String[] args) 
	{
		String str = "Suresh";
		byte[] bytes = str.getBytes();
		System.out.println("String to Byets = " + Arrays.toString(bytes));
		
		byte[] bytes1 = {83, 117, 114, 101, 115, 104};
		String str1 = new String(bytes1);
		System.out.println("Bytes to string = " + str1);

	}

}
