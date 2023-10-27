package arrays;

public class Assignment54 
{

	public static void main(String[] args) 
	{
		String name[] = new String[3];
		name[0] = "Ram";
		name[1] = "Laxman";
		name[2] = "Sita";
		
		int age[] = new int[3];
		age[0]=51;
		age[1]=42;
		age[2]=34;
		
		
		for(int i=0;i<3;i++)
		{
			System.out.print(name[i]);
		}
		for(int i=0;i<3;i++)
		{
			System.out.print(age[i]);
		}
	}

}
