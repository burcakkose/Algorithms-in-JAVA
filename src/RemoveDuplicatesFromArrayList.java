import java.util.*;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(2);
		arrList.add(5);
		arrList.add(65);
		arrList.add(23);
		arrList.add(43);
		arrList.add(5);
		arrList.add(77);
		arrList.add(3);
		arrList.add(35);
		
		//List<Integer> arrList = Arrays.asList(2,3,6,5);
		

		removeDuplicate(arrList);

	}
	
	static void removeDuplicate(List<Integer> arr)
	{

		Set<Integer> setList = new HashSet<Integer>(arr);
		ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>(setList);
		
		System.out.println("Removed duplicate elements. New list is: "+listWithoutDuplicates);
		System.out.println("Removed duplicate elements. New set is: "+setList);
		
	}

}
