package collections;
import java.util.*;
public class HashSet_Demo1 {
//1.insertion order is not preserved
//2.Duplicate elements are not allowed
	public static void main(String[] args) {
		//HashSet hs=new HashSet();//default capacity 16 load factor 0.75
		//HashSet hs=new HashSet(100);//initial capacity100
		
		//HashSet<Integer> hs=new HashSet<Integer>();
		
		HashSet hs=new HashSet();
		hs.add("bavajan");
		hs.add(100);
		hs.add('A');
		hs.add(null);
		hs.add(48.48);
		System.out.println(hs);//[null, A, 48.48, 100, bavajan]

		hs.remove(48.48);
		System.out.println("After removing the elements"+hs);
		//[null, A, 100, bavajan]
		
		System.out.println(hs.contains("Bavajan"));//false
		System.out.println(hs.contains("bavajan"));//true
		
		System.out.println(hs.isEmpty());//false
		
		
		System.out.println("reading the elements for hashset using for eachloop");
		
		for(Object x:hs) {
			System.out.println();
			
		}
		
	System.out.println("reading the elements for hashset using iterative method");
		
		Iterator it =hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
