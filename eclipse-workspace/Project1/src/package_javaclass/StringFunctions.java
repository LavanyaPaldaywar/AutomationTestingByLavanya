//Assignment 42 - String Functions
package package_javaclass;
public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String a="Lavanya";
		String b="Paldaywar";
		String c="   India   ";
		String d= "@@@india@@@";
		String e="";
		String f="";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		//System.out.println(a.charAt(100));// StringIndexOutOfBoundsException
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf('v'));
		System.out.println(a.indexOf('a'));//returns 1st occurrence index of a character
		System.out.println(a.indexOf('z'));//character not present in string, should return -1
		System.out.println(a.substring(1));
		System.out.println(b.substring(3, 6));
		//System.out.println(b.substring(100,200));// StringIndexOutOfBoundsException
		System.out.println(c.trim());
		System.out.println(d.trim());
		System.out.println(a.contains("v"));
		System.out.println(e.contains(""));
		System.out.println(a.isEmpty());
		System.out.println(e.isEmpty());
		System.out.println(a.matches(b));
		System.out.println(e.matches(f));
		System.out.println(a.concat(b));
		System.out.println(a.concat(" ").concat(b));
		System.out.println(a.concat(" ").concat(b).concat("@").concat("123"));
		}

}
