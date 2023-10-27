package typecasting;
class State
{
	void statename()
	{
		System.out.println("TS");
	}
	void stateroad()
	{
		System.out.println("State Highway");
	}
}

public class UpcastingExample1 extends State
{
	void cityname()
	{
		System.out.println("Hyd");
	}
	void cityroad()
	{
		System.out.println("City Highway");
	}
	public static void main(String[] args) 
	{
		State s1= new UpcastingExample1();//upcasting
		s1.statename();
		s1.stateroad();
		
		UpcastingExample1 u1 = (UpcastingExample1) s1;//downcasting
		u1.cityname();
		u1.cityroad();
		u1.statename();
		u1.stateroad();
	}

}
