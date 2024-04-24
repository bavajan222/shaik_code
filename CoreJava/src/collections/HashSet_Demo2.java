package collections;
import java.util.*;
public class HashSet_Demo2 {

	public static void main(String[] args) {
		
		HashSet<Integer>evennumber=new HashSet<Integer>();
		
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		System.out.println(evennumber);//[2, 4, 6]
		
		HashSet<Integer>numbers=new HashSet<Integer>();
		numbers.addAll(evennumber);
		numbers.add(10);
		System.out.println(numbers);//[2, 4, 6, 10]
		
		numbers.removeAll(evennumber);
		System.out.println(numbers);//[10]
		
		
	}

}
