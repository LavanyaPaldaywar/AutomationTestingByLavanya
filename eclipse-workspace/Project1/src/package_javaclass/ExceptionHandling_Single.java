//Exception Handling (single try block)

package package_javaclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Single 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			boolean a=s1.nextBoolean();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Handling InputMismatchException1");
		}
	}

}
