package package_javaclass;
public class This_Keyword 
{
	int a;
	String b;
	double c;
	
	void thisargs(int a1,String b1,double c1)
	{
		this.a=a1;
		this.b=b1;
		this.c=c1;
	}
	void thisargs1(int x1,String y1,double z1)
	{
		this.a=x1;
		this.b=y1;
		this.c=z1;
	}
	public static void main(String[] args) 
	{
		This_Keyword t1 = new This_Keyword();
		t1.thisargs1(20, "Lavanya1", 20.45);
		This_Keyword t2 = new This_Keyword();
		t2.thisargs(10, "Lavanya", 10.45);
		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(t2.c);
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
	}

}
