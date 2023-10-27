//create 4 if blocks with "&&" operator ,"||" operator, 
//AndNot operator, Ornot operator in which Only if block will execute
package package_javaclass;
public class Assignment07 
{

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		if(a==10 && b>a)
		{
			System.out.println("If block is executing");
		}
		if(a<b || b==20 )
		{
			System.out.println("If block is executing");
		}
		if(!(a>b && b<a))
		{
			System.out.println("If block is executing");
		}
		if(!(a==5 || b==10))
		{
			System.out.println("If block is executing");
		}
	}

}
