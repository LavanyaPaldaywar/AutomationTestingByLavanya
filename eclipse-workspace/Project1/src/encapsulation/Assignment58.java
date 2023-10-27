package encapsulation;
final class LoginDetails
{
	private String userid = "Login123";
	private String password= "123456";
	private String secretcode ="ABC123";
	
	public void setUserid(String userid) 
	{
		this.userid = userid;
	}
	public String getUserid() 
	{
		return userid;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}	
}
public class Assignment58 {

	public static void main(String[] args) 
	{
		LoginDetails l1 = new LoginDetails();
		l1.setUserid("Lavanya123");
		System.out.println(l1.getUserid());
		l1.setPassword("123Lavanya");
		System.out.println(l1.getPassword());
	}

}
