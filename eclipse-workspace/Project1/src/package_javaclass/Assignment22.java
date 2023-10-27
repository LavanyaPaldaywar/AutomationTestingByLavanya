//Generate InputMismatchException with scanner methods

package package_javaclass;
import java.util.Scanner;

public class Assignment22
{
	static void int1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter int value");
		int a=s1.nextInt();
		
	}
	static void byte1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter byte value");
		byte b=s1.nextByte();
		
	}
	static void short1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter short value");
		short c=s1.nextShort();
		
	}
	static void long1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter long value");
		long d=s1.nextLong();
		
	}
	static void boolean1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter boolean value");
		boolean e=s1.nextBoolean();
		
	}
	static void float1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter float value");
		float f=s1.nextFloat();
		
	}
	static void double1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter double value");
		double g=s1.nextDouble();
		
	}
	public static void main(String[] args) 
	{
		int1();
		byte1();
		short1();
		long1();
		boolean1();
		float1();
		double1();
	}

}
