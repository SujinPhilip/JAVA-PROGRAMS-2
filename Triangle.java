public class Triangle{
public static void main(String[] args) {
	angle obj= new angle();
 }
}
class angle{
	angle()
	{
		int a=3,b=4,c=5;
		int p=(a+b+c)/2;
		double perimeter=a+b+c;
		double area= Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Perimeter= "+perimeter);
		System.out.println("Area= "+area);
	}
}