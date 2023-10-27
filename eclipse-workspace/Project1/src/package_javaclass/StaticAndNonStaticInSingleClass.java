package package_javaclass;

public class StaticAndNonStaticInSingleClass
{
	public static void add() // static method
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	public void subtract() // non static method
	{
		int a=300;
		int b=400;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		StaticAndNonStaticInSingleClass s = new StaticAndNonStaticInSingleClass();
		add(); // calling static method
		s.subtract(); // calling non static method
	}

}
