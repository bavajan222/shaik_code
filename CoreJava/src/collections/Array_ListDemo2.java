package collections;
import java.util.*;
public class Array_ListDemo2 {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("A");
		al.add("B");
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);//[x, y, z, A, B]
        
		al_dup.removeAll(al);
		System.out.println(al_dup);//[]
      //sort...Collections.sort()
		
		System.out.println("Elements in the arrylist" +al);//[x, y, z, A, B]
	
	Collections.sort(al);
	System.out.println("After sorting..."+al);//[A, B, x, y, z]
	
	//i want to sort the arraylist in rev order
	Collections.sort(al,Collections.reverseOrder());
	System.out.println("Elemts after sorting reverse order--->"+al);//[z, y, x, B, A]
	
	//shuffling -Collections.shuffling()
	
	Collections.shuffle(al);
	System.out.println("after shuffling--->"+al);//[B, x, y, A, z]

	}

}
