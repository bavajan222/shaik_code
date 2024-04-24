package collections;

import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {
	//1.Heterogenious data allowed
	//2.insertion order is not preserved-(index not supported)
	//3.Duplicate elements are not allowed
	//4.multiple nulls are not allowed-only single null is allowed
	public static void main(String[] args) {
		
		  Set s1=   new TreeSet();
		   s1.add(123);
		   s1.add(345);
		   s1.add(543);
		   s1.add(33);
		   s1.add(22);
		   s1.add(143);
		   s1.add(143);
		  // s1.add(null);
		
		   System.out.println(s1);
		

	}

}
