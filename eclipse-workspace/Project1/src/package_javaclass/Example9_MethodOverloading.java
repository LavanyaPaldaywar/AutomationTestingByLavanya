package package_javaclass;

public class Example9_MethodOverloading
{
	void add(int a)
	{
		System.out.println("Hello");
	}
	void add()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		Example9_MethodOverloading e2 = new Example9_MethodOverloading();
		e2.add();
		e2.add(0);

	}

}
