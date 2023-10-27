//create a class with static, non static and constructor
package package_javaclass;

public class test
{

	static void add()
	{
		System.out.println("hi");
	}
	void sub(int a)
	{
		System.out.println("hello");	
	}
	test()
	{
		System.out.println("bye");
	}
	public static void main(String[] args)
	{
		add();
		test t1 = new test();
		t1.sub(0);
	}

}
