
//Create a class out of ram's yearly salary , donate 10% to charity//

package package_javaclass;

public class Example6_WithSalaryAndDonationToCharity 
{

	public static void main(String[] args)
	{
		short MonthlySalary=2000;
		int yearlysalary=12*MonthlySalary; 
		System.out.println(yearlysalary);
		System.out.println("ram's yearly salary is " +yearlysalary);
		
		//int donation=(10*yearlysalary)/100;
		double donation=0.1*yearlysalary;
		System.out.println(donation);
		System.out.println("Donation amount is " +donation);
		
	}

}
