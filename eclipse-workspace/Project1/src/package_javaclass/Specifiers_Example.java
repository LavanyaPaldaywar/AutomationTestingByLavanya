//Assignment 37 - All access specifiers within the class
package package_javaclass;
public class Specifiers_Example 
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
	public static void main(String[] args) 
	{
		Specifiers_Example s1 = new Specifiers_Example();
		System.out.println("Access Specifiers that can be accessed with in the class are:");
		s1.method1();
		s1.method2();
		method3(); 
		s1.method4();
	}

}
