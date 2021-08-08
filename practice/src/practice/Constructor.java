package practice;

public class Constructor 
{
	
	int a;
	String s;
	char c;
	float f;
	double d;
	boolean b;
	short sh;
	long l;
	public static void main(String[] args)
	{
		new Constructor();
	}
	
	Constructor()

	{
		System.out.println("default value of int : "+a);
		System.out.println("default value of String : "+s);
		System.out.println("default value of char : "+c);
		System.out.println("default value of float : "+f);
		System.out.println("default value of double : "+d);
		System.out.println("default value of boolean : "+b);
		System.out.println("default value of short : "+sh);
		System.out.println("default value of long : "+l);
		
	}
}
