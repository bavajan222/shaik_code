package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Collection_Arraylist {

	public static void main(String[] args) {
		
		//1.Heterogenious data allowed
		//2.insertion order preserverd like 1,2,3,...
		//3.duplicate elements are allowed
		//4.multiple nulls are allowed
		  List l= new ArrayList();
		  
		  l.add(200);
		  l.add(2344);
		  l.add(235);
		  l.add(22);
		  l.add(99);
		  l.add(2);
		 // l.add(null);
		 // l.add(null);
		  //l.add(null);
		 l.add(123);
		 l.add(123);
		 java.util.Collections.sort(l);
		 System.out.println(l);
		  
		  
	}

}
