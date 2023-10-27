//Create a class with 4 static methods(create scanner class) 
//and call all methods in PSVM 
package package_javaclass;

import java.util.Scanner;

public class Assignment21 
{
	static void addition()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter value of b");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("The addition of two numbers is: " +c);
		//s1.close();
	}
	static void subtract()
	{
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s2.nextInt();
		System.out.println("Enter value of b");
		int b=s2.nextInt();
		int c=a-b;
		System.out.println("The subtraction of two numbers is: " +c);
		//s2.close();
	}
	static void multiply()
	{
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s3.nextInt();
		System.out.println("Enter value of b");
		int b=s3.nextInt();
		int c=a*b;
		System.out.println("The multiplication of two numbers is: " +c);
		//s3.close();
	}
	static void divide()
	{
		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s4.nextInt();
		System.out.println("Enter value of b");
		int b=s4.nextInt();
		int c=a/b;
		System.out.println("The division of two numbers is: " +c);
		//s4.close();
	}
	public static void main(String[] args) 
	{
		addition();
		subtract();
		multiply();
		divide();
		
	}

}
