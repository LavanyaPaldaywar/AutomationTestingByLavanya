package package_javaclass;
public class Country12
{
	void nationalhighway()
	{
		System.out.println("NH");
	}
}
public class State12 extends Country12
{
	void statehighway()
	{
		System.out.println("SH");
	}
}
public class City extends State12
{
	void Cityhighway()
	{
		System.out.println("CH");
	}
	public static void main(String[] args)
	{
		City c1=new City();
		c1.Cityhighway();
		c1.statehighway();
		c1.nationalhighway();
	}
}

/*Pink color --> keywords
Class_FirstProgram --> identifier
{ } --> Separators*/