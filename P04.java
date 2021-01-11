import java.util.Scanner;
public class P04{
	String name= "";
	P04(double l,double b){	
		name=String.format("%.3f", (l*b));
	}
	String Area() {
		return this.name;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth");
		double l = sc.nextDouble();
		double b=sc.nextDouble();
		P04 ob = new P04(l,b);
		String name = "";
		name=ob.Area();
		
		System.out.println("Area of rectangle = "+name);
		
		
	}

	
}