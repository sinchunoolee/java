import java.util.Scanner;
public class twoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String a="";
		String b="";
		System.out.println("enter your first string: ");
		a=s.next();
		
		System.out.println("enter your second string: ");
		b=s.next();
		
		String r=TwoStr(a,b);

	}
	public static String TwoStr(String a, String b) {
		String r=""; 
		if(a==b)
			System.out.println("given strings are equal");
		else
			System.out.println("given strings are not equal");
		return r;
	
	}

}
