
import java.util.Scanner;
public class P01
 {
	
	void shape(double l,double b){
		
		String area=String.format("%.3f", (l*b));
		System.out.println("Area of Rectange :"+area+"");
	}
	
	void shape(double r){
		
		double pi = 3.14;
		String area= String.format("%.3f", (pi*Math.pow(r, 2)));
		System.out.println("Area of Circle : "+area+"");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius,length,breadth;
		System.out.println("Enter the Radius");
		radius =sc.nextDouble();
		P01 circle = new P01();
		circle.shape(radius);
		System.out.println("Enter Length and Breath of rectangle ");
		length = sc.nextDouble();
		breadth=sc.nextDouble();
		P01 rectangle = new P01();
		rectangle.shape(length, breadth);
	}
	

}