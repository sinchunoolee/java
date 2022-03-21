import java.util.*;
public class CheckTwoNumareEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=0;
		int b=0;
		System.out.println("enter your first number: ");
		a=s.nextInt();
		
		System.out.println("enter your second number: ");
		b=s.nextInt();
		
		int r=Twonum(a,b);

		
	}
	public static Integer Twonum(int a, int b) {
		int r=0; 
		if(a==b)
			System.out.println("given numbers are equal");
		else
			System.out.println("given numbers are not equal");
		return r;
	
	}

}
