/*Assignment 35
 * Multiple Inheritance 
2 - Interfaces
3 - classes

class3 implements interface1,interface2
class2 extends class3
class1 extends class2
 */
package inheritance;
interface login
{
	void login1();
}
interface logout
{
	void logout1();
}
class Class3 implements login,logout
{
	static void class3()
	{
		System.out.println("class 3");
	}

	@Override
	public void logout1() 
	{
		System.out.println("logout");
	}
	@Override
	public void login1() 
	{
		System.out.println("login");		
	}
}
class Class2 extends Class3
{
	void class2()
	{
		System.out.println("class 2");
	}
}
class Class1 extends Class2
{
	void class1()
	{
		System.out.println("class 1");
	}
	public static void main(String[] args) 
	{
		Class1 c1 = new Class1();
		c1.class1();
		c1.class2();
		class3();
		c1.login1();
		c1.logout1();

	}

}
