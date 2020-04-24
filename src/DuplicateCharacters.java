import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {
	
	static void dublicateCharCount(String inputString)
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] charArray = inputString.toCharArray();
		
		for(char c: charArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		
		Set<Character> charSet = charCountMap.keySet();
		
		System.out.println("Duplicate elements in:"+inputString);
		int none=0;
		
		for(Character ch: charSet)
		{
			if(charCountMap.get(ch)>1)
			{
				System.out.println(ch+" : "+charCountMap.get(ch));
				none++;
			}
		}
		
		if(none==0)
		{
			System.out.println("No duplicate elements");
		}
	}
	
	
	public static void main(String[] args) {
		
		dublicateCharCount("JavaJ2EE");
		dublicateCharCount("BurcakGungor");
	}

}
