//Create a program in which we can call non static method by creating an object of a class.

package package_javaclass;

public class CallingMultipleNonStaticMethods
{
	void add() // non static method
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	void subtract() // non static method
	{
		int a=100;
		int b=200;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args)// main method 
	{
		CallingMultipleNonStaticMethods a = new CallingMultipleNonStaticMethods(); // creating object
		a.add(); // calling a non static method with reference variable
		a.subtract();// calling a non static method with reference variable
	}

}
