package collections;

import java.util.HashSet;

public class HashSet_Demo3 {

	public static void main(String[] args) {
		//union,intersection,difference
		
		HashSet<Integer>set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(set1);//[1, 2, 3, 4, 5]
		HashSet<Integer>set2=new HashSet<Integer>();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println(set2);//[3, 4, 5]
         
		//union
	//	set1.addAll(set2);
		//System.out.println("union results" +set1);////[1, 2, 3, 4, 5]
		//it will give only unique elements and any duplicates are there
		//it will remove
		
	//	intersection :the common elemetnts will get set1 and set2
		//set1.retainAll(set2);
		//System.out.println(set1);//[3, 4, 5]

		 //difference-between two sets
		//set1.removeAll(set2);
	//	System.out.println(set1);//[1, 2]

		//subset
		
		System.out.println(set1.containsAll(set2));//true
		
		}

}
