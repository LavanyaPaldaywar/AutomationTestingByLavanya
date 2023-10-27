//Create a class with 5 constructors 
//with all the data types except int,short,long

package package_javaclass;
public class Constructor_Overloading 
{
	Constructor_Overloading(int a)
	{
		System.out.println("constructor with int");
	}
	Constructor_Overloading(float b)
	{
		System.out.println("constructor with float");
	}
	Constructor_Overloading(double c)
	{
		System.out.println("constructor with double");
	}
	Constructor_Overloading(boolean d)
	{
		System.out.println("constructor with boolean");
	}
	Constructor_Overloading(char e, String f)
	{
		System.out.println("constructor with char and string");
	}
	public static void main(String[] args)
	{
		new Constructor_Overloading(10);
		new Constructor_Overloading(10.6f);
        new Constructor_Overloading(3.5);
        new Constructor_Overloading(true);
        new Constructor_Overloading('L',"Lavanya");
	}

}
