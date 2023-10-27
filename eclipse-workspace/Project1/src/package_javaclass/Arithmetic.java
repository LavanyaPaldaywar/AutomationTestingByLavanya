
/* Create a class with 4 static methods , 
one method each for add,subtract,multiple,divide 
and perform operations in its method*/

package package_javaclass;
public class Arithmetic
{
	public static void add()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	public static void subtract()
	{
		int a=100;
		int b=200;
		int c=a-b;
		System.out.println(c);
	}
	public static void multiple()
	{
		int a=100;
		int b=200;
		int c=a*b;
		System.out.println(c);
	}
	public static void divide()
	{
		int a=100;
		int b=200;
		int c=b/a;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add();//static method
		subtract();//static method
		multiple();//static method
		divide();//static method
    }
}
