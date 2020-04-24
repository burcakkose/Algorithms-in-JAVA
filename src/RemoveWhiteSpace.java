import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String stringWithoutSpaces = str.replaceAll("\\s", "");
		
		System.out.println(stringWithoutSpaces);
		
		sc.close();
	}

}
