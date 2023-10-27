//Method overloading demo program with same method name different arguments

package package_javaclass;

public class Example10_MethodOverloading 
{
	void add(int a)
	{
		System.out.println("Hi");
	}
	void add(int a, int b)
	{
		System.out.println("Hello");
	}
	void add(int a , float b , int c)
	{
		System.out.println("Bye");
	}
	public static void main(String[] args)
	{
		Example10_MethodOverloading e10 = new Example10_MethodOverloading();
		e10.add(0);
		e10.add(0, 0);
		e10.add(0, 0, 0);
		}

}
