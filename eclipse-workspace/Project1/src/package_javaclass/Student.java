//Method overriding
package package_javaclass;
class Teacher
{
	void java()
	{
		System.out.println("teaching");
	}
}
public class Student extends Teacher
{
	void java()
	{
		super.java();
		System.out.println("learning");
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.java();
	}

}
