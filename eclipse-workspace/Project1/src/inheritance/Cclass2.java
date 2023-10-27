//Assignment 27 - Program for both Abstract methods and Concrete methods(Class 19)
package inheritance;
abstract class Aclass //abstract class
{
	abstract void add(); //abstract method - non static method
	static void subtract() //concrete method - static method
	{
		System.out.println("subtract method");
	}
}
abstract class Cclass1 extends Aclass //concrete class
{
	void multiply()//concrete method - non static method
	{
		System.out.println("multiply method");
	}

	/*@Override
	void add() //concrete method - non static method , abstract method overridden
	{
		System.out.println("add method");
	}*/
}	
class Cclass2 extends Cclass1//concrete class
{
	static void divide()//concrete method - static method
	{
		System.out.println("divide method");
	}
	void add() //concrete method  - non static method , abstract method overridden
	{
		System.out.println("add method 1");
	}
	public static void main(String[] args) 
	{
		Cclass2 c2 = new Cclass2();
		divide();
		c2.multiply();
		c2.add();
		subtract();
	}

}
