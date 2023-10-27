package typecasting;
class Teacher
{
	void role()
	{
		System.out.println("Teacher");
	}
}
class Mentor extends Teacher
{
	void role1()
	{
		System.out.println("Mentor");
	}
}
public class UpcastingExample2 extends Mentor
{
	void role2()
	{
		System.out.println("Student");
	}
	public static void main(String[] args) 
	{
		// can only access grandparent members as superclass type is Teacher
		Teacher t1 = new UpcastingExample2(); 
		t1.role();
		//t1.role1(); 
		//t1.role2();
		
		// can access grandparent and parent members as superclass type is Mentor and inherited by Teacher
		Mentor m1= new UpcastingExample2();
		m1.role();
		m1.role1(); 
		//m1.role2();
		
		
		// can access grandparent and parent members with childest class object
		UpcastingExample2 u1 = new UpcastingExample2();
		u1.role(); 
		u1.role1();
		u1.role2();
		
		//downcasting to child from grandparent
		UpcastingExample2 u2 = (UpcastingExample2) t1;
		u2.role();
		u2.role1();
		u2.role2();
		
		//downcasting to parent from grandparent
		Mentor m2 = (Mentor)t1;
		m2.role();
		m2.role1();
		//m2.role2();
		
	}

}
