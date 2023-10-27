package package_javaclass;

public class Example100
{
	static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	double add(int a,double b)  
	{
		double c=a+b;
		return 9.76;
	}
	String add()
	{
		String a="";
		return a;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(add(17,30));
		Example100 e1=new Example100();
		System.out.println(e1.add(87, 3.15));
		
	}

}
