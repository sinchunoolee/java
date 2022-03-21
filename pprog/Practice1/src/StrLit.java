import java.util.*;
public class StrLit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name="";
		int age = 0;
		double num=0;
		
		System.out.println("Hello"+name);
		name=s.next();
		
		System.out.println("my age is"+age);
		age=s.nextInt();
		
		System.out.println("Enter your num:");
		num=s.nextDouble();
		
		System.out.println(num+age+name);
		System.out.println(num+name+age+age);
		System.out.println(name+num+age);
		System.out.println((num+age)+name);
		System.out.println(name+(age+num)+name);
		System.out.println((name+name)+(num+age));
		
		

		
		
	}

}
