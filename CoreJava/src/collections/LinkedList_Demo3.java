package collections;
import java.util.*;
public class LinkedList_Demo3 {

	public static void main(String[] args) {
		
		//Linked list specific methods these will be used for implement 
		//stack and queue operations
		
		LinkedList l=new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		System.out.println(l);
		
		l.addFirst("tiger");
		l.addLast("lion");
		System.out.println(l);//[tiger, dog, dog, cat, horse, lion]

		System.out.println(l.getFirst());//tiger
		System.out.println(l.getLast());//lion
		
		l.removeFirst();
		System.out.println(l);//[dog, dog, cat, horse, lion]
		
		l.removeLast();
		System.out.println(l);//[dog, dog, cat, horse]

	}

}
