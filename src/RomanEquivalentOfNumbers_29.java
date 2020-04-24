import java.util.*;

public class RomanEquivalentOfNumbers_29 {
	
	public static void main(String args[]) {
		int inputNumber;
		String roman="";
		
		String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		inputNumber = sc.nextInt();
		sc.close();
		
		int copyOfNumber = inputNumber;
		
		for(int i=0; i<romanSymbols.length; i++) {
			
			while(inputNumber >= decimals[i]) {
				inputNumber = inputNumber - decimals[i];
				roman = roman + romanSymbols[i];
			}
		}
		System.out.println("Roman of: "+copyOfNumber+" is "+roman);		
	}
	
}
