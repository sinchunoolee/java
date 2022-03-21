package pprog;
import java.util.*;
import java.lang.*;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double r=0;
		double area=0;
		
		System.out.println("Enter the radius:");
		r=s.nextDouble();
				
		area=getAreaofCircle(r);
		System.out.println("Area  is:"+area);
		
		System.out.println("Enter the radius:");
		r=s.nextDouble();
				
		area=getAreaofCircle(r);
		System.out.println("Area is:"+area);


	}
	public static Double getAreaofCircle(double r) {
		
		double area = Math.PI*r*r;
		return area;
	}

}
