//A program with 2 SIB, 2 IIB, 2Constructor, 
//1 NS method and 1 SM, all should execute

package package_javaclass;
public class Assignment28
{
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	Assignment28()
	{
		System.out.println("Constructor 1");
	}
	Assignment28(int a)
	{
		System.out.println("Constructor 2");
	}
	void nonstatic()
	{
		System.out.println("Non Static Method");
	}
	static void method()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args)
	{
		method();//static method
		Assignment28 a28= new Assignment28();//creating object
		a28.nonstatic();//calling non static method
		new Assignment28(0);//calling parameterized constructor
		System.out.println("Close");
		
		
	}

}
