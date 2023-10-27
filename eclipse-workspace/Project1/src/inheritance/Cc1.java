//Assignment 29
package inheritance;
class Cc2
{
	void nonstatic() 
	{
		System.out.println("Cc2 - concrete - non static method");
	}
}
abstract class Ac2 extends Cc2
{
	abstract void ac2();
	abstract void ac4();
	static void method()
	{
		System.out.println("Ac2 - concrete - static method");
	}
}	
abstract class Ac1 extends Ac2
{
	abstract void ac1();
	abstract void ac3();
	static void method1()
	{
		System.out.println("Ac1 - concrete - static method");
	}
	void nonstatic1()
	{
		System.out.println("Ac1 - concrete - non static method");
	}
}
class Cc1 extends Ac1
{
	static void method2()
	{
		System.out.println("Cc1 - concrete - static method");
	}
	void nonstatic2()
	{
		System.out.println("Cc1 - concrete - non static method");
	}
	
	@Override
	void ac1() 
	{
		System.out.println("Ac1 - abstract - non static");
	}
	@Override
	void ac3() 
	{
		System.out.println("Ac1 - abstract - non static");		
	}
	@Override
	void ac2() 
	{
		System.out.println("Ac2 - abstract - non static");		
	}
	@Override
	void ac4() 
	{
		System.out.println("Ac2 - abstract - non static");			
	}
	public static void main(String[] args) 
	{
		Cc1 c1 = new Cc1();
		c1.nonstatic();
		method();
		c1.ac2();
		c1.ac4();
		c1.ac1();
		c1.ac3();
		method1();
		c1.nonstatic1();
		method2();
		c1.nonstatic2();
	}
	
}
