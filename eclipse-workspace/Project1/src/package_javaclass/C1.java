//Multilevel inheritance program
package package_javaclass;
class Gp1//grandparent class
{
	void gp1()//non static
	{
		System.out.println("gp1");
	}
}
class P1 extends Gp1//parent class extends grandparent
{
	static void p1()//static method
	{
		System.out.println("p1");
	}
}
	
class C1 extends P1 //child class extends parent
{
	void c1()//non static
	{
		System.out.println("c1");
	}
	public static void main(String[] args) 
	{
		C1 c = new C1();
		p1(); //parent class static method
		c.gp1();//grand parent class non static method
		c.c1();//child class non static method
	}

}
