package package_javaclass;

public class CallingStaticMethod
{

	public void add() //this is method declaration
	{
		System.out.println("One");
	}
	static void subtract() //this is method declaration
	{
		System.out.println("Two");
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Hello");
		subtract();// static method can be called directly inside class // method calling
		//add(); // shows compile time error because non-static method can not be called directly inside main(static).
	}

}
