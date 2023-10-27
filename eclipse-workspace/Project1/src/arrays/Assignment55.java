package arrays;
public class Assignment55 
{
	public static void main(String[] args) 
	{
		String City[] = new String[4];
		City[0]="Hyderabad";
		City[1]="Bangalore";
		City[2]="Pune";
		City[3]="Chennai";
		
		boolean Visit[] = new boolean[4];
		Visit[0]=true;
		Visit[1]=true;
		Visit[2]=true;
		Visit[3]=false;
		
		String Message[] = new String[4];
		Message[0]="I have been there";
		Message[1]="I have been there";
		Message[2]="I have been there";
		Message[3]="I will visit soon";
		
		for(int i=0;i<4;i++)
		{
			System.out.print(City[i]);
			System.out.print("		"+Visit[i]);
			System.out.println("		"+Message[i]);
		}	
	}

}
