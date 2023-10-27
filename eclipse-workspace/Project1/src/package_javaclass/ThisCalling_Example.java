//Assignment36 - this calling statement
package package_javaclass;

public class ThisCalling_Example
{
	ThisCalling_Example()
	{
		System.out.println("Non Parameterized Constructor");
	}
	ThisCalling_Example(int a)
	{
		this();
		System.out.println("Parameterized Constructor ");
	}
	public static void main(String[] args) 
	{
		new ThisCalling_Example(10);
	}

}
