package package_javaclass;

public class CallingNonStaticMethod
{
	void add() // non static method
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)//main method
	{
		CallingNonStaticMethod a = new CallingNonStaticMethod(); // creating object
		a.add(); // calling a non static method with reference variable
	}

}
