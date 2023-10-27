//Assignment 38 - 2 different classes in one package eg. class Student and class Teacher
package package_javaclass;
class Example2
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
public class Specifiers_Example2
{
	public static void main(String[] args) 
	{
		Example2 e2 = new Example2();
		System.out.println("Access Specifiers that can be accessed with in the package are:");
		e2.method1();
		Example2.method3();//classname.methodname - static method - from other class
		e2.method4();	
	}

}
