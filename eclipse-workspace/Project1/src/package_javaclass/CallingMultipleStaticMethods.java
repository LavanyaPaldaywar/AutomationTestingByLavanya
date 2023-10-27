
package package_javaclass;

public class CallingMultipleStaticMethods
{
	static void add()
	{
		System.out.println("Addition");
	}
	static void subtract()
	{
		System.out.println("Subtraction");
	}
	static void multiple()
	{
		System.out.println("Multiplication");
	}
	static void divide()
	{
		System.out.println("Division");
	}
	public static void main(String[] args)
	{
		//line by line execution
		System.out.println("Hi I am starting");
		add();
		subtract();// we can call same method any number of times
		subtract();// we can call same method any number of times
		multiple();
		divide();
	}
}

// output is nothing - no output
