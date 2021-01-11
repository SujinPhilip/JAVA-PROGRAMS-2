public class P03{
public static void main(String[] args) {
	triangle obj= new triangle();
 }
}
class triangle{
	triangle()
	{
		int a=3,b=4,c=5;
		int s=(a+b+c)/2;
		double perimeter=a+b+c;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Perimeter= "+perimeter);
		System.out.println("Area= "+area);
	}
}