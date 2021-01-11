import java.util.Scanner;
public class Area{
	String name= "";
	Area(double l,double b){	
		name=String.format("%.3f", (l*b));
	}
	String a() {
		return this.name;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth");
		double l = sc.nextDouble();
		double b=sc.nextDouble();
		Area ob = new Area(l,b);
		String name = "";
		name=ob.a();
		
		System.out.println("Area of rectangle = "+name);
		
		
	}

	
}