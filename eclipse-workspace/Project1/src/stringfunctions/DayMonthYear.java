//Assignment 42 - Fetch day , month , year separately

package stringfunctions;
public class DayMonthYear 
{

	public static void main(String[] args) 
	{
		String a = "12 DEC 2021";
		System.out.println(a.substring(0, 2));
		System.out.println(a.substring(3 ,6));
		System.out.println(a.substring(7 ,11));
	}

}
