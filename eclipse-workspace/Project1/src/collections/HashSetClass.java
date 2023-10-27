package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetClass 
{
	public static void main(String[] args) 
	{
	HashSet a1 = new HashSet();
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
	
	HashSet a2 = new HashSet();
	a2.add(81);
	a2.add(671);
	a2.add(91);
	a2.add(9);
	//Collections.sort(a2);
	System.out.println(a2);
}
}
