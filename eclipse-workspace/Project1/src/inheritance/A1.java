/*Assignment 30
Class 20: Program for the below:
Abstract Class - CM-2 & AM-2
Abstract Class - CM-2 & AM-2
Class CM-2

CM- Concrete method
AM- Abstract method*/
package inheritance;
abstract class B2
{
	abstract void black();
	abstract void white();
	static void pink() 
	{
		System.out.println("pink");
	}
	void orange()
	{
		System.out.println("orange");
	}
}
abstract class B1 extends B2
{
	abstract void blue();
	abstract void green();
	static void grey()
	{
		System.out.println("grey");
	}
	void brown()
	{
		System.out.println("brown");
	}
}
class A1 extends B1
{
	static void red()
	{
		System.out.println("red");
	}
	void yellow()
	{
		System.out.println("yellow");
	}
	@Override
	void blue() 
	{
		System.out.println("blue");		
	}
	@Override
	void green() 
	{
		System.out.println("green");	
	}
	@Override
	void black() 
	{
		System.out.println("black");	
	}
	@Override
	void white() 
	{
		System.out.println("white");	
	}
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.black();
		a.white();
		pink();
		a.orange();
		a.blue();
		a.green();
		grey();
		a.brown();
		red();
		a.yellow();
	}

}
