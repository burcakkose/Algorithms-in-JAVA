import java.util.Arrays;

public class SelectionSort_27 {

	public static void main(String[] args) {
		
		int[] arr = {21,45,-11,18,51,32,6};
		selectionSort(arr);

	}
	
	static void selectionSort(int[] arr) {
		
		int position=0, temp=0;
		
		for(int i=0; i< arr.length; i++) {
			
			position = i;
			
			//finding the position of smallest element between (i+1)th element and last element
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[j] < arr[position]) {
					position = j;
				}
			}
			//Swapping inputArray[i] and inputArray[pos]
			temp = arr[i];
			arr[i] = arr[position];
			arr[position] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
