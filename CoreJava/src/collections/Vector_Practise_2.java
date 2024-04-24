package collections;

import java.util.Vector;

public class Vector_Practise_2 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("shaik");
		v1.add("jan");
	    v1.add(0, "nawaz");
	    v1.add("sasi");
	
	    System.out.println(v1);
	    v1.set(1, "Virat");
	    
	    Vector v2=new Vector();
	    v2.add("name");
	    v2.add("devillers");
	    v1.addAll(v2);
	    
	    System.out.println(v1);
	    System.out.println(v1.indexOf("sasi"));//3
	    System.out.println(v1.lastIndexOf("name"));//4
	    System.out.println(v1.lastElement());//devillers
	    System.out.println(v1.firstElement());//nawaz
	}

}
