import java.util.Arrays;
import java.util.Scanner;

public class SeperateZeros_23 {

	public static void main(String[] args) {
				
		int[] arr = {14, 0, 5, 2, 0, 3, 0};
		int counter=0;
		
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != 0) {

					arr[counter] = arr[i];
					counter++;
				}
			}
			
			while(counter < arr.length) {
				
				arr[counter]=0;
				counter++;
			}
		
		System.out.println(Arrays.toString(arr));

	}

}
