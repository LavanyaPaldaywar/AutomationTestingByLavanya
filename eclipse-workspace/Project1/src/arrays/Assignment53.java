/*Assignment 53*/

package arrays;
public class Assignment53 
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
		
		char gender[] = new char[3];
		gender[0]='M';
		gender[1]='M';
		gender[2]='F';
		
		for(int i=0;i<3;i++)
		{
			System.out.print(name[i] +"	");
			System.out.print(gender[i] +"	");
			System.out.println(age[i]);
			
		}
	}

}