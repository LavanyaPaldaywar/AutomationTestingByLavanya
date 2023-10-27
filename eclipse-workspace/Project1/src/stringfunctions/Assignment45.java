/*Assignment 45
Input : India
Output : India is my country*/

package stringfunctions;
public class Assignment45 
{

	public static void main(String[] args) 
	{
		String a = "India";
		System.out.println(a.concat(" ").concat("is").concat(" ").concat("my").concat(" ").concat("country"));
		System.out.print(a.concat(" ").concat("is").concat(" ").concat("my").concat(" ").concat("country"));
		
		/*
		System.out.print(a.concat(" ").concat("is").concat(" ").concat("my").concat(" ").concat("country"));
		System.out.println(a.concat(" ").concat("is").concat(" ").concat("my").concat(" ").concat("country"));
		 --> results in India is my countryIndia is my country
		 */
	}

}
