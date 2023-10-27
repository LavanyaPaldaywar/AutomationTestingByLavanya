package package_p2;

import package_p1.Class3;

public class Class4
{

	public static void main(String[] args) 
	{

		Class3 c3 = new Class3();
		System.out.println("Access Specifiers that can be accessed outside the package with out becoming subclass are:");
		c3.method1();
		/*c3.method2();
		Class3.method3();
		c3.method4();*/
		
	}

}
