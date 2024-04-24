package collections;

import java.util.*;

public class LinkedList_Demo1 {

	public static void main(String[] args) {

		//Declare linked list
	
		
		//List l=new LinkedList();
		//store hoomogenious data
	//	LinkedList<String> l=new LinkedList<String>();
		
		LinkedList l=new LinkedList();
        //add elements into the Linkedlist
		
		l.add(100);
		l.add("rani");
		l.add(12.66);
		l.add('B');
		l.add(true);
		l.add(null);
		
		System.out.println(l);//[100, rani, 12.66, B, true, null]

		//size
		System.out.println(l.size());//6
		//remove
		l.remove(3);
		System.out.println(l);//[100, rani, 12.66, true, null]
        l.removeFirst();
        System.out.println(l);//[rani, 12.66, true, null]
        l.removeLast();
        System.out.println(l);//[rani, 12.66, true]
        l.remove("rani");
        System.out.println(l);//[12.66, true]
   
        //insert new elemrnt into the arraylist
        
        l.add("jan");
        l.addFirst("bavajan");
        System.out.println(l);//[bavajan, 12.66, true, jan]

        l.add(1, "l2.22");	
        l.addLast("eagle");
        System.out.println(l);//[bavajan, l2.22, 12.66, true, jan, eagle]

        //retriving the value from linkedlist
        
       System.out.println(l.get(2));//12.66
       System.out.println(l.getLast());//eagle
      //change the exsting value
       
       l.set(0, "shaik");
       System.out.println(l);//[shaik, l2.22, 12.66, true, jan, eagle]
      
       //fetch value present in the list or not
       System.out.println(l.contains(true));//true
      
       
       //check given linked list empty or not
       
       System.out.println(l.isEmpty());//false

    //to read the linked list data
	System.out.println("Reading elements using forloop...........");
       for(int i=0;i<l.size();i++) {
    	   
    	   System.out.println(l.get(i));
       }
       
       //using for eachloop
       System.out.println("Reading elements using for eachloop ...........");
        
       for(Object x:l) {
    	   System.out.println(x);
       }
     //3.by using iterator()
     		System.out.println("Reading elements using iterator method...");
                 Iterator i=l.iterator();
                 while(i.hasNext()) 
                 {
                	 System.out.println(i.next());
                 }
	} 

}
