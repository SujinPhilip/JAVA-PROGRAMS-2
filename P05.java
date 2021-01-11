public class P05{
public static void main(String[] args) {
	pc obj=new pc();
	obj.sp();
	cc obj1=new cc();
	obj1.sc();
	obj1.sp();
 }
}
class pc
{
	void sp(){
		System.out.println("This is Parent Class");
	}
}
class cc extends pc{
	void sc(){
		System.out.println("This is Child Class");
	}
}