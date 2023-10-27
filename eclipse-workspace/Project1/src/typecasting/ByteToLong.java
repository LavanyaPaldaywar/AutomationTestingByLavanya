package typecasting;

public class ByteToLong 
{

	public static void main(String[] args) 
	{
		byte no = 100;
		long no1 = no;//implicit
		System.out.println(no1);
		long no2 =(long)no;//explicit
		System.out.println(no2);
	}

}
