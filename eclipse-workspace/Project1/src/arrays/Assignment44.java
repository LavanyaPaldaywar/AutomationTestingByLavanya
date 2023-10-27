/*Exception-ArrayIndexOutOfBoundsException*/

package arrays;

public class Assignment44
{

	public static void main(String[] args)
	{
		String name[]= new String[5];
		name[0]="orange";
		name[1]="pink";
		name[2]="red";
		name[3]="black";
		name[4]="white";
		name[5]="yellow";
		
		for(int i=0;i<=4;i++)
		{
		System.out.println(name[i]);
		}
	}

}