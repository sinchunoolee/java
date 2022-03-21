import java.util.*;
public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=0;
		System.out.println("enter your number: ");
		a=s.nextInt();
		double sqr=SquareOfANumber(a);
		System.out.println("Square of your number: "+sqr);
			
	}
	public static Double SquareOfANumber(double a){
		Double sqr=a*a;
		return sqr;	
	}
}
