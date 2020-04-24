import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		isAnagram("Dormitory", "Dirty Room");
		isAnagram("School Master", "The Classroom");
		isAnagram("burcak", "kose"); 
		
	}
	
	static void isAnagram(String str1, String str2)
	{
		String anag1 = str1.replaceAll("\\s", "");
		String anag2 = str2.replaceAll("\\s", "");
		
		char[] arr1 = anag1.toLowerCase().toCharArray();
		char[] arr2 = anag2.toLowerCase().toCharArray();
		
		if(arr1.length == arr2.length)
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean a = arr1.equals(arr2); //returns false because compares as Object(same as array1 == array2)
			boolean b = Arrays.equals(arr1, arr2); //returns true because compares the contents of the arrays.
			
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println(anag1+" and "+anag2+" are anagram.");
			}
			else
			{
				System.out.println(anag1+" and "+anag2+" are not anagram.");
			}	
		}
		else
		{
			System.out.println(anag1+" and "+anag2+" are not anagram.");
		}
			
	}

}
