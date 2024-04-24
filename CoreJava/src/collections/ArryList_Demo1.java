package collections;

import java.util.*;

public class ArryList_Demo1 {

	public static void main(String[] args) {
		//declare arraylist 
	
	  //i want to store homogenious data
		//ArrayList<String> a1=new ArrayList<String>();
	//	ArrayList<Integer> a1=new ArrayList<Integer>();
		//List l=new ArrayList();
		
		ArrayList al=new ArrayList();
		
		//add new elements to the arraylist
		
		
		al.add("shaik");
		al.add("nazi");
		al.add('S');
		al.add(123);
		al.add(true);
		al.add(13.5);
		//i want print all the data from arraylist
		System.out.println(al);//[shaik, nazi, S, 123, true, 13.5]
		
		//how many objects are stored in arraylist  use size()
		
		System.out.println(al.size());//6
		//want to remove some object in the arraylist remove()
		al.remove(0);//or
        al.remove("shaik");//directly pass object name

		System.out.println(al);//[nazi, S, 123, true, 13.5]
		
		//insert a new element to the arraylist

		al.add(1,"python");
		System.out.println("After insertion---> "+al);//[bavajan, python, S, 123, true, 13.5]
       // i want to retrive specific value from the given arrayliss get()
		
		System.out.println(al.get(3));//123  -->3 is the index of element
		
		//i want to replace withe new value set()
		al.set(1, "java");
		System.out.println(al);//[nazi, java, S, 123, true, 13.5]
		// want to check or verify given value is presnt inside the array or not contains()
		System.out.println(al.contains("java"));//true
		//isempty() will check our arraylist is empty or not
		System.out.println(al.isEmpty());//false
		
		//How to read the data we have 3 approaches
		
	/*1.forLoop
		System.out.println("Reading elements using forloop...........");
		for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));//nazi
		}	//java
			//S
			//123
			//true
			//13.5
		//2.using for each loop
	 System.out.println("Reading elements using for eachloop...");

			for(Object x:al) {
			System.out.println(x);	
			}  */
		//3.by using iterator()
		System.out.println("Reading elements using iterator method...");

		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//printing element and move to the next
		}
		
}}
				
				
			
	

