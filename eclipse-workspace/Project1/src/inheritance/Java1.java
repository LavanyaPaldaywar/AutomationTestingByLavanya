/*Assignment 31
Program for Interface and Class with the keyword " implements "(Class 21)*/
package inheritance;
interface Java2
{
	void java();
}
public class Java1 implements Java2
{
	@Override
	public void java() 
	{
		System.out.println("java");
	}
	static void learning()
	{
		System.out.println("learning");
	}
	public static void main(String[] args) 
	{
		Java1 j1 = new Java1();
		j1.java();
		learning();
	}

	

}
