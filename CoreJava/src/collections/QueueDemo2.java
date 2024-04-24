package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		LinkedList q=new LinkedList();
		
		//Adding element add() or offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer(100);
		System.out.println(q);//[A, B, C, C]
     //i want to get the heder element from thid queue 
		//element or peek
		
		//System.out.println(q.element());//A
		//System.out.println(q.peek());//A
		
		//want to return and remove the element
//remove or pull
	//	q.remove(); //or
		//q.poll();
		////System.out.println(q);//[B, C, C]
        
		//i want read all the elements in the queue
		
		Iterator it=q.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
			//by using for eachloop
			
			for(Object X:q) {
				
				System.out.println(X);
			}
			
		}
}
