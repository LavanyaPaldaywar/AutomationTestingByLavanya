package typecasting;

public class IntToDouble 
{

	public static void main(String[] args)
	{
		int wt =85;
		double wt1 = wt; // implicit
		System.out.println(wt1);
		double wt2 = (double) wt; //explicit
		System.out.println(wt2);
	}

}
