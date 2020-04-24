import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IntersectionOfTwoArrays_19 {

	public static void main(String[] args) {

		int[] arr1 = {1,3,6,7};
		int[] arr2= {4,3,2,7,9};
		
		intersectionOfTwoArrays(arr1, arr2);

	}
	
	static void intersectionOfTwoArrays(int[] a1, int[] a2) {
		
		int[] a3 = Arrays.copyOf(a1, a1.length + a2.length); //bu satır sadece ilk arrayi a3 içerisine koyar gerisi 
																								//a2 uzunlugunda 0
		System.arraycopy(a2, 0, a3, a1.length, a2.length);   //a3 e a2 yi de koyar
		
//		for(int i=0; i<a3.length; i++) {
//			System.out.println(a3[i]);
//		}
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0; i<a3.length; i++) {
			if(hm.containsKey(a3[i])){
				hm.put(a3[i], hm.get(a3[i])+1);
			}
			else {
				hm.put(a3[i], 1);
			}	
		}
		
		System.out.println("Intersection numbers are: ");
		
		for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
			if(e.getValue()>1)
			{
				System.out.println(e.getKey());
			}
		}
			
	}

}
