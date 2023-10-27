package package_javaclass;

import java.util.Scanner;

public class Test2 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter float value"); //10
		float a =s1.nextFloat();
		System.out.println(a); //10.0
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter double value");
		double b =s1.nextDouble();
		System.out.println(b);
		

	}

}

//can we pass int/byte/short/long values to nextFloat() and nextDouble()?