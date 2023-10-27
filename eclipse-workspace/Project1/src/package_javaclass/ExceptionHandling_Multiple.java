//Exception Handling (Multiple catch blocks)

package package_javaclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Multiple 
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
		catch(NullPointerException a2)
		{
			System.out.println("Handling NullPointerException1");
		}
		finally
		{
			System.out.println("Thankyou");
		}
	}

}
