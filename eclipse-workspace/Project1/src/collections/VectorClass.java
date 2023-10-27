package collections;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {
	
	public static void main(String[] args) 
	{
		Vector a1 = new Vector();
		a1.add("Ram");
		a1.add(51);
		a1.add('M');
		a1.add(5.9);
		a1.add("Laxman");
		a1.add("Ram");
		a1.add(null);
		System.out.println(a1);
		a1.add(51);
		a1.add('M');
		a1.add(5.9);
		a1.add("Laxman");
		a1.add("Ram");
		a1.add(null);
		System.out.println(a1);
		
		Vector a2 = new Vector();
		a2.add(81);
		a2.add(671);
		a2.add(91);
		a2.add(9);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
