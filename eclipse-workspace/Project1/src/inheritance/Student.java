//Hybrid level inheritance program
package inheritance;
class Director extends Principal
{
	static void managementdetails()
	{
		System.out.println("Director - management details");
	}
	void studentdetails()
	{
		System.out.println("Director - student details");
	}
}
class Principal
{
	static void duties()
	{
		System.out.println("Principal - duties");
	}
}
class Teacher extends Principal
{
	static void teachingjava()
	{
		System.out.println("Teacher - teaching java");
	}
	void teachingselenium()
	{
		System.out.println("Teacher - teaching selenium");
	}
}
class Student extends Teacher 
{
	static void learningjava()
	{
		System.out.println("Student - Learning java");
	}
	void learningselenium()
	{
		System.out.println("Student - Learning selenium");
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.learningselenium();//non static
		learningjava();//static
		s1.teachingselenium();//non static
		teachingjava();//static
		duties();//static
		Director D1 = new Director();//creating object for no relation class
		Director.managementdetails();// how to call this static method when there is no relation? Ans:classname.methodname
		D1.studentdetails();//calling non static with object when there is no relation Ans: object.methodname
	}

}
