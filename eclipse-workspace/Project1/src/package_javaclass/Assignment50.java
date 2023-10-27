/*Usage of Date Class
Print the Current, Past, and Future time of the Server.
*/

package package_javaclass;
import java.util.Date;
public class Assignment50
{
	void present()
	{
		Date d1 = new Date();
		System.out.println("Present Epoch Time");
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		String format=d2.toString();
		System.out.println("Present Date is:");
		System.out.print((format.substring(8,10).concat("-")));//date
		System.out.print((format.substring(4,7).concat("-")));//month
		System.out.print(format.substring(24));//year
		System.out.println();
		System.out.println();
	}
	void past()
	{
		Date d1 = new Date();
		System.out.println("Past Epoch Time");
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime()-(1000*60*60*24*3));
		String format=d2.toString();
		System.out.println("Past Date is:");
		System.out.print((format.substring(8,10).concat("-")));//date
		System.out.print((format.substring(4,7).concat("-")));//month
		System.out.print(format.substring(24));//year
		System.out.println();
		System.out.println();
	}
	void future()
	{
		Date d1 = new Date();
		System.out.println("Future Epoch Time");
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*3));
		String format=d2.toString();
		System.out.println("Future Date is:");
		System.out.print((format.substring(8,10).concat("-")));//date
		System.out.print((format.substring(4,7).concat("-")));//month
		System.out.print(format.substring(24));//year
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Assignment50 a = new Assignment50();
		a.present();
		a.past();
		a.future();
	}

}
