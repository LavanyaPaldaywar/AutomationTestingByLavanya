//Super Calling Statement

package package_javaclass;
class Test1
{
	Test1()
	{
		System.out.println("non parameterized");
	}
	Test1(int a)
	{
		System.out.println("parameterized");
	}
}
public class SuperCalling extends Test1
{
	SuperCalling()
	{
		super(1000); //--> for parameterized explicit
		//super(); --> for non parameterized implicit or explicit
		System.out.println("SuperCalling child class constructor");
	}
	public static void main(String[] args) 
	{
		new SuperCalling();
		
	}

}
