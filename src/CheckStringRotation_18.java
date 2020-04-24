
public class CheckStringRotation_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";  // J2eeStrutsHibernateJava, HibernateJavaJ2eeStruts
		
		String s3 = s1+s1;
		
		if(s1.length() != s2.length()) {
			System.out.println(s2+" is not rotated version of "+s1);
		}
		else
		{
			if(s3.contains(s2))
			{
				System.out.println(s2+" is rotated version of "+s1);
			}
			else {
				System.out.println(s2+" is not rotated version of "+s1);
			}
		}	
	}
	
}
