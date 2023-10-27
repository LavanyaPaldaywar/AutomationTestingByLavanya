//Inheritance example program-parent& child class
package package_javaclass;
class Transport //parent class
{
	static void buses()//static method
	{
		System.out.println("Bus Transportation");
	}
	void railway()//non static method
	{
		System.out.println("Railway Transportation");
	}
}
class State1 extends Transport // child class extends parent class
{
	void airways() //non static method
	{
		System.out.println("Airways");
	}
	public static void main(String[] args) 
	{
		State1 s1= new State1();//creating object of child class
		buses(); //static method from parent class
		s1.railway(); //non static method from parent class
		s1.airways(); // non static method from child class
	}

}
