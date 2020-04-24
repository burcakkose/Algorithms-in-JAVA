
import java.util.*;
import java.util.Map.Entry;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] arr1 = {1,4,4};
		int[] arr2 = {1,3,2};
		
		findDuplicate(arr1);
		findDuplicate(arr2);

	}
	
	static void findDuplicate(int[] array)
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i : array)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
			{
				hm.put(i, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
		boolean duplicate = false;
		
			for(Entry<Integer, Integer> entry : entrySet)
			{
				if(entry.getValue()>1)
				{
					System.out.println("In your array "+entry.getKey()+" has found "+entry.getValue()+" times.");
					duplicate = true;
				}		
			}
			
			if(!duplicate)
			{
				System.out.println("No duplicate");
			}
	}

}
