import java.util.Arrays;
import java.util.HashMap;

public class OccurrenceOfCharInString {

	public static void main(String[] args) {
		
		findOccurences("ALL Is Well");

	}
	
	static void findOccurences(String str) {
		
		
		String copyStr = str.replaceAll("\\s",  ""); 
		
		char[] arr = copyStr.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c: arr)
		{
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
		
	}

}
