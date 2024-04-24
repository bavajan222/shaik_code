package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_Demo1 {

	public static void main(String[] args) {
		
		LinkedHashSet lset=new LinkedHashSet();
		//1.insertion order is preserved
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		System.out.println(lset);//[100, 200, 300, 400, 500]


	}

}
