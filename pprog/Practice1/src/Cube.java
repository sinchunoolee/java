import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=0;
		System.out.println("enter your number: ");
		a=s.nextInt();
		double c=CubeOfANumber(a);
		System.out.println("Square of your number: "+c);
			
	}
	public static Double CubeOfANumber(double a){
		Double c=a*a*a;
		return c;	
	}
}
