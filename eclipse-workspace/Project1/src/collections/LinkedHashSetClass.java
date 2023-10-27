package collections;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetClass 
{
	public static void main(String[] args) 
	{
	LinkedHashSet a1 = new LinkedHashSet();
	a1.add("Ram");
	a1.add(51);
	a1.add('M');
	a1.add(5.9);
	a1.add("Laxman");
	a1.add("Ram");
	a1.add(null);
	a1.add("Ram");
	a1.add(51);
	a1.add('M');
	a1.add(5.9);
	a1.add("Laxman");
	a1.add("Ram");
	a1.add(null);
	System.out.println(a1);
	
	LinkedHashSet a2 = new LinkedHashSet();
	a2.add(81);
	a2.add(671);
	a2.add(91);
	a2.add(9);
	//Collections.sort(a2);
	System.out.println(a2);
}
}
