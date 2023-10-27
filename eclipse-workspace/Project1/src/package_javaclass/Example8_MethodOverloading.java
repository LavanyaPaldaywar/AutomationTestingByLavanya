package package_javaclass;

public class Example8_MethodOverloading 
{
	void add()
	{
	System.out.println("Hi");
	}
	void add(int a)
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Example8_MethodOverloading e1 = new Example8_MethodOverloading();
		e1.add(0);
		e1.add();
	}

}
