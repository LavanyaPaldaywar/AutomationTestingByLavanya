package package_p1;

public class Class3 
{
	
	public void method1() //public and non-static
	{
		System.out.println("Public Access Specifier");
	}
	private void method2() // private and non-static
	{
		System.out.println("Private Access Specifier");
	}
	protected static void method3() //protected and static
	{
		System.out.println("Protected Access Specifier");
	}
	void method4() //Default/Package non-static
	{
		System.out.println("Default or Package Access Specifier");
	}

}
