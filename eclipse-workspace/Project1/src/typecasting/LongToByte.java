package typecasting;

public class LongToByte 
{

	public static void main(String[] args) 
	{
		// not correct as per range
		long a = 30000;
		byte b = (byte)a;
		System.out.println(b);
		
		//correct example
		long a1 = 100;
		byte b1 = (byte)a1;
		System.out.println(b1);

	}

}
