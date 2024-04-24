package collections;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("shaik");
		a1.add("jan");
		a1.add(23);
		a1.add("mahesh");
		a1.remove("jan");
		System.out.println(a1.isEmpty());//false
	     a1.clear();//will become empty array
	System.out.println(a1);
		boolean b=a1.contains("shaa");
		System.out.println(b);//false
		
		ArrayList a2=new ArrayList();
		a2.add("Naveen");
		a2.add("Lakka");
		System.out.println(a2.size());//2
		a2.addAll(a1);
		
		a2.removeAll(a1);
		System.out.println(a2);
		
		System.out.println(a2.containsAll(a1));
		System.out.println(a2);
	}

} 
