package package_javaclass;
public class Assignment17 
{
	void rectangle()
	{
		int l=24;
		int b=6;
		int area=l*b;
		System.out.println("Area of rectangle " +area);
	}
	void square()
	{
		int a=4;
		int area=a*a;
		System.out.println("Area of square " +area);
	}
	void traingle()
	{
		int b=6;
		int h=10;
		double area=0.5*b*h;
		System.out.println("Area of triangle " +area);
	}
	public static void main(String[] args) 
	{
		Assignment17 a17 = new Assignment17();
		a17.rectangle();
		a17.square();
		a17.traingle();
	}

}
