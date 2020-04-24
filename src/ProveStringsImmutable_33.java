
public class ProveStringsImmutable_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABC";
		String s2 = s1;
		String s3 = "ABC";
		
		String s4=new String("hello");
		String s5=new String("hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println();
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	
		s1=s1+"DEF";
		System.out.println();
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);

	}

}
