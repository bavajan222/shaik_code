package collections;
import java.util.*;
public class LinkedList_Demo2 {

	public static void main(String[] args) {
		//sorting shuffling is possible only same kind of data
		LinkedList l=new LinkedList();
		l.add("x");
		l.add("y");
		l.add("A");
		l.add("B");
		l.add("C");
		
		List l1=new LinkedList();
		
		l1.addAll(l);
		System.out.println(l1);//[x, y, A, B, C]
		
	l1.removeAll(l);
	System.out.println(l1);//[]

		//sort
	Collections.sort(l);
	System.out.println("After sorting---->"+l);//[A, B, C, x, y]

	//How to sort rev order 
	
	Collections.sort(l,Collections.reverseOrder());
	System.out.println("After soring reverse order-->"+l);//[y, x, C, B, A]

	//shuffle
	
	Collections.shuffle(l);
	System.out.println("After shuffling--->" +l);//[x, B, C, A, y]
	
	}

}
