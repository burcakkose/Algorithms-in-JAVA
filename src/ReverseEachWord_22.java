import java.util.Arrays;

public class ReverseEachWord_22 {

	public static void main(String[] args) {
		
		String str = "Java Concept Of the Day";
		String[] s1 = str.split("\\s");
		//System.out.println(Arrays.toString(s1));
		
		System.out.println(str);
	
		for(int i=0; i<s1.length; i++) {
			System.out.print(reverse(s1[i])+" ");
		}
		
	}
	
	static String reverse(String string)
	{
		String copyString = string;
		
		if(copyString==null || copyString.length() <=1)
		{
			return copyString;
		}
		else
		{
			return reverse(copyString.substring(1))+copyString.charAt(0);
		}
	}

}
