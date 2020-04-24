

public class ReverseString {

	public static void main(String[] args) {

		String str="burcak";
		char[] strChar = str.toCharArray();

		//Iterative Method
		for(int i=str.length()-1; i >= 0 ; i--) {

			System.out.print(strChar[i]);
		}
		
		System.out.println();
		System.out.println(recursiveMethod(str));
		
	}

	//Recursive Method
	static String recursiveMethod(String str)
	{
		if(str==null || str.length()<=1)
		{
			return str;
		}
		
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}
